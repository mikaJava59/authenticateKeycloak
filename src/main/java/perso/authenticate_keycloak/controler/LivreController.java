package perso.authenticate_keycloak.controler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import perso.authenticate_keycloak.model.Livre;
import perso.authenticate_keycloak.service.LivreService;

import java.util.List;

@RestController
public class LivreController {

    @Autowired
    private LivreService livreService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/api/livre")
    public ResponseEntity<List<Livre>> getAllLivre(){
        try{
            List<Livre> livres = livreService.findAllLivre();
            return ResponseEntity.status(HttpStatus.FOUND).body(livres);
        }catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

}
