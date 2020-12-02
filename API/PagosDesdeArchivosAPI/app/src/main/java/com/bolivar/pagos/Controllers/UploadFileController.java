package pagos;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadFileController {

    @PostMapping(value = "/uploadFile")
    public ResponseEntity<String> uploadFile(){
        return new ResponseEntity<String>("uploadFile", HttpStatus.CREATED);
    }
}