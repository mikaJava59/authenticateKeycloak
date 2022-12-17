package perso.authenticate_keycloak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import perso.authenticate_keycloak.dao.LivreRepository;
import perso.authenticate_keycloak.model.Livre;

import java.util.List;

@Service
public class LivreServiceImp implements LivreService {

    @Autowired
    private LivreRepository livreRepository;

    @Override
    public List<Livre> findAllLivre() {
        return livreRepository.findAll();
    }
}
