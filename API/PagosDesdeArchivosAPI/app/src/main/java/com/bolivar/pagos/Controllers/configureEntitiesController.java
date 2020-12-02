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
public class configureEntitiesController {

    @GetMapping(value = "/configureEntities")
    public ResponseEntity<String> getEntities(){
        return new ResponseEntity<String>("getEntities", HttpStatus.OK);
    }

    @PostMapping(value = "/configureEntity")
    public ResponseEntity<String> createEntity(){
        return new ResponseEntity<String>("createEntity", HttpStatus.CREATED);
    }

    @GetMapping(value = "/configureEntity")
    public ResponseEntity<String> getEntityById(@RequestParam("id") String id){
        return new ResponseEntity<String>("getEntityById " + id, HttpStatus.OK);
    }

    @PutMapping(value = "configureEntity")
    public ResponseEntity<String> updateEntity(@RequestParam("id") String id){
        return new ResponseEntity<String>("updateEntity " , HttpStatus.ACCEPTED);
    }
}