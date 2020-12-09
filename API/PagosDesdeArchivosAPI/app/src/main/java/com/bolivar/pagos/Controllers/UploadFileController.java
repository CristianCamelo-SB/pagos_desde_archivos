package pagos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
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
            //}
            return new ResponseEntity<String>("uploadFile", HttpStatus.CREATED);
        } catch (IOException e) {
            //TODO: handle exception
            return new ResponseEntity<String>("uploadFile", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }
}