package tn.esprit.foyer_yaich_zaineb.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Foyer")
public class Foyer {
    @Id
    @Column(name = "identifiant") //pour ajouter des contraintes dans la BD
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment par la BD
    private long idFoyer;
    @Column(name = "nom")
    private String nomET;
}
