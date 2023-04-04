package com.example.immunization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "encounter")
public class EncounterEntity {

    @Id
    @SequenceGenerator(name = "encounter_seq_id", sequenceName = "encounter_seq_id", initialValue = 5001, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "encounter_seq_id")
    @Column(name = "encounter_id")
    private Long encounterId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private PatientEntity patientEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provider_id")
    private ProviderEntity providerEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "practice_id")
    private PracticeEntity practiceEntity;



}

