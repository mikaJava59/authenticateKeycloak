package perso.authenticate_keycloak.service;

import perso.authenticate_keycloak.model.Livre;

import java.util.List;

public interface LivreService {

    List<Livre> findAllLivre();

}
