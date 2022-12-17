package perso.authenticate_keycloak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "livres")
public class Livre {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                      VARIABLE D'INSTANCE                                                       //
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Id
    private String id;

    @Column(name = "nom")
    private String name;

    private String etat;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                      TO STRING
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Livre{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", etat='" + etat + '\'' +
                '}';
    }

}
