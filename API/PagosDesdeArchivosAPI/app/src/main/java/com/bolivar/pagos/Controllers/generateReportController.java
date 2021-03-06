package pagos;

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

@RestController
public class generateReportController {

    @GetMapping(value = "/generateReports")
    public ResponseEntity<String> getReports(){
        return new ResponseEntity<String>("getReports", HttpStatus.OK);
    }

    @GetMapping(value = "/generateReport")
    public ResponseEntity<String> getReportById(@RequestParam("id") String id){
        return new ResponseEntity<String>("getReportById " + id, HttpStatus.CREATED);
    }
}