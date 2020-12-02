package pagos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @RequestMapping("/")
    public String inicio() {
        return "Este es el indice de la API";
    }
}