package tn.esprit.foyer_yaich_zaineb.DAO.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "utilisateur") //pour personnaliser le nom de la table dans la BD
public class Etudiant {
    @Id
    @Column(name = "identifiant") //pour ajouter des contraintes dans la BD
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment par la BD
    private long idEtudiant;
    @Column(name = "nom")
    private String nomET;
    @Column(name = "prenom")
    private String prenomET;
    @Column(name = "ecole")
    private String ecole;
    @Column(name = "datenaissance")
    private LocalDate date_naissance;


}
