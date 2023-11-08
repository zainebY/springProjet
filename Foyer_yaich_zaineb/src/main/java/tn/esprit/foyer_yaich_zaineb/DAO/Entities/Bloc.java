package tn.esprit.foyer_yaich_zaineb.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "bloc")
public class Bloc {
    @Id
    @Column(name = "identifiant") //pour ajouter des contraintes dans la BD
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment par la BD
    private long idBloc;
    @Column(name = "nom Foyer")
    private String nomFoyer;
    @Column(name = "capacite Foyer")
    private long capaciteFoyer;

}
