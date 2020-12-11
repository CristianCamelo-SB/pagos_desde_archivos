package pagos;

import pagos.models.PaymentFile;
import pagos.models.Header;
import pagos.models.ClientInformation;
import pagos.models.MonthlyBillInformation;
import pagos.models.PaymentInformation;
import pagos.models.Record;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.ranges.RangeException;

@RestController
public class UploadFileController {

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadFile(@RequestParam("files") MultipartFile files){
        try {
            //for(int i=0; i<files.size(); i++){
                File convertFile = new File(files.getOriginalFilename());

                convertFile.createNewFile();
                FileOutputStream fout = new FileOutputStream(convertFile);
                fout.write(files.getBytes());
                fout.close();

                Scanner sc = new Scanner(convertFile);
                int i = 0;
                Header fileHeader = null;
                ArrayList<Record> fileRecords = new ArrayList<Record>();
                while (sc.hasNextLine()) {
                    PaymentInformation paymentInformation = null;
                    ClientInformation clientInformation = null;
                    ArrayList<Integer> clientWalletInformation = new ArrayList<Integer>();
                    ArrayList<MonthlyBillInformation> monthlyBillsInformation = new ArrayList<MonthlyBillInformation>();
                    String data = sc.nextLine();
                    String[] recordParts = data.split(";");
                    if (i == 0) {
                        String[] headerParts = recordParts[0].split(",");
                        fileHeader = new Header(Integer.parseInt(headerParts[0]), Double.parseDouble(headerParts[1]), headerParts[2], headerParts[3]); 
                    }else{
                        for (int j = 0; j < recordParts.length; j++) {
                            String[] parts = recordParts[j].split(",");
                            switch (j) {
                                case 0:
                                    paymentInformation = new PaymentInformation(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2]), parts[3]);
                                    break;

                                case 1:
                                    String[] address = parts[2].split("/");
                                    clientInformation = new ClientInformation(parts[0], Integer.parseInt(parts[1]), address[0], address[1], address[2]);
                                    break;

                                case 2:
                                    for (int k = 0; k < parts.length; k++) {
                                        clientWalletInformation.add(Integer.parseInt(parts[k]));
                                    }
                                    break;

                                case 3:
                                    for (int k = 0; k < parts.length; k++) {
                                        String[] billParts = parts[k].split("/");
                                        monthlyBillsInformation.add(new MonthlyBillInformation(Integer.parseInt(billParts[0]), billParts[1], Double.parseDouble(billParts[2]), Double.parseDouble(billParts[3])));    
                                    }
                                    break;

                                default:
                                    System.out.println("error");
                                    break;
                            }
                        }
                        fileRecords.add(new Record(paymentInformation, clientInformation, clientWalletInformation, monthlyBillsInformation));
                    }
                    i++;
                }
                PaymentFile paymentFile = new PaymentFile(fileHeader, fileRecords);
                sc.close();
            //}
            return new ResponseEntity<String>("uploadFile", HttpStatus.CREATED);
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
            return new ResponseEntity<String>("uploadFile", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }
}