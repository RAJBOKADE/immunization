package com.example.immunization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mediation_ingredients")

public class MedicationIngredientsEntity {

    @Id
    @SequenceGenerator(name = "mediation_ingredients_seq_id", initialValue = 9001, sequenceName = "mediation_ingredients_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lot_seq_id")
    private Long medicationIngredientsId;

    @Column(name = "preservatives")
    private String preservatives;

    @Column(name = "stablizer")
    private String stabilizer;

    @Column(name = "source")
    private String source;

    @Column(name = "excipient")
    private String excipient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medicationId")
    private MedicationIngredientsEntity medicationIngredientsEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vaccineId")
    private VaccineEntity vaccineEntity;


}
