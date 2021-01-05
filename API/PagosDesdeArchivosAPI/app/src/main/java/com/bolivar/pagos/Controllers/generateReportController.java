package pagos;

import pagos.models.ReportEntity;
import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class generateReportController {

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/generateReports")
    public ResponseEntity<ArrayList<ReportEntity>> getReports(){
        ArrayList<ReportEntity> entities = new ArrayList<ReportEntity>();
        ReportEntity p = new ReportEntity(1, "1234567890", "Seguros Bolivar", "Calle falsa 123", 200000);
        entities.add(p);
        ReportEntity s = new ReportEntity(2, "2345678901", "Muebles JAMAR", "Calle falsa 456", 100000);
        entities.add(s);
        return new ResponseEntity<ArrayList<ReportEntity>>(entities, HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/generateReport")
    public ResponseEntity<ReportEntity> getReportById(@RequestParam("id") String id){
        ReportEntity p = null;
        if (id.equals("1")) {
            p = new ReportEntity(1, "1234567890", "Seguros Bolivar", "Calle falsa 123", 200000);
        }else{
            if (id.equals("2")) {
                p = new ReportEntity(2, "2345678901", "Muebles JAMAR", "Calle falsa 456", 100000);
            }
        }
        return new ResponseEntity<ReportEntity>(p, HttpStatus.CREATED);
    }
}