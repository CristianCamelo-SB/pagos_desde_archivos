package pagos;

import pagos.models.CollectingEntity;
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
public class configureEntitiesController {

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/configureEntities")
    public ResponseEntity<ArrayList<CollectingEntity>> getEntities(){
        ArrayList<CollectingEntity> entities = new ArrayList<CollectingEntity>();
        CollectingEntity p = new CollectingEntity(1, "1234567890", "Seguros Bolivar", "Calle falsa 123");
        entities.add(p);
        CollectingEntity s = new CollectingEntity(2, "2345678901", "Muebles JAMAR", "Calle falsa 456");
        entities.add(s);
        return new ResponseEntity<ArrayList<CollectingEntity>>(entities, HttpStatus.OK);
    }

    @PostMapping(value = "/configureEntity")
    public ResponseEntity<String> createEntity(){
        return new ResponseEntity<String>("createEntity", HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/configureEntity")
    public ResponseEntity<CollectingEntity> getEntityById(@RequestParam("id") String id){
        CollectingEntity p = null;
        if (id.equals("1")) {
            p = new CollectingEntity(1, "1234567890", "Seguros Bolivar", "Calle falsa 123");
            System.out.println("Salio 1");
        }else{
            System.out.println("paso por aqui");
            if (id.equals("2")) {
                p = new CollectingEntity(2, "2345678901", "Muebles JAMAR", "Calle falsa 456"); 
                System.out.println("Salio 2");
            }
        }
        return new ResponseEntity<CollectingEntity>(p, HttpStatus.OK);
    }

    @PutMapping(value = "configureEntity")
    public ResponseEntity<String> updateEntity(@RequestParam("id") String id){
        return new ResponseEntity<String>("updateEntity " , HttpStatus.ACCEPTED);
    }
}