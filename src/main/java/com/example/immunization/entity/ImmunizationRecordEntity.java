package com.example.immunization.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "immunization_record")

public class ImmunizationRecordEntity {

    @Id
    @SequenceGenerator(name = "immunization_record_seq_id", initialValue = 201, sequenceName = "immunization_record_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "immunization_record_seq_id")
    private Long immunizationRecordId;

    @Column(name = "date_administered")
    private LocalDateTime dateAdministered;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medication_id")
    private MedicationEntity medicationEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_vaccination_id")
    private PatientVaccinationEntity patientVaccinationEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "encounter_id")
    private EncounterEntity encounterEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lot_id")
    private LotEntity lotEntity;

}
