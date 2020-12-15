package ma.gde.entities;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private Date dateNaissance;
    @Column
    private String email;
    @Column
    private String role;
    @Column
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
}

