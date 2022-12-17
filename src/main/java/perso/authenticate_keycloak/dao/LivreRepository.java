package perso.authenticate_keycloak.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import perso.authenticate_keycloak.model.Livre;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, String> {

    List<Livre> findAll();

}
