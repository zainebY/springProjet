package tn.esprit.foyer_yaich_zaineb.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "universite")
public class Universite {
    @Id
    @Column(name = "identifiant") //pour ajouter des contraintes dans la BD
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment par la BD
    private long idUniversite;
    @Column(name = "nom universite")
    private String nomUniversite;
    @Column(name = "adresse")
    private String adresse;
}
