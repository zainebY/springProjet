package tn.esprit.foyer_yaich_zaineb.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "chambre")
public class Chambre {
    @Id
    @Column(name = "identifiant") //pour ajouter des contraintes dans la BD
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment par la BD
    private long idChambre;
    @Column(name = "numero chambre")
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}
