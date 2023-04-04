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
@Table(name = "patient_vaccination")
public class PatientVaccinationEntity {

    @Id
    @SequenceGenerator(name = "patient_vaccination_seq_id", sequenceName = "patient_vaccination_seq_id", initialValue = 8001, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_vaccination_seq_id")
    @Column(name = "patient_vaccination_id")
    private Long patientVaccinationId;

    @Column(name = "date_administered")
    private LocalDateTime dateAdministered;

    @Column(name = "scheduled_date")
    private LocalDateTime scheduledDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private PatientEntity patientEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vaccine_id")
    private VaccineEntity vaccineEntity;

}
