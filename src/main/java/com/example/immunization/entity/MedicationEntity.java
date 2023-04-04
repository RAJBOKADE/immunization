package com.example.immunization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medication")
public class MedicationEntity {

    @Id
    @SequenceGenerator(name = "medication_seq_id", sequenceName = "medication_seq_id", initialValue = 7001, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medication_seq_id")
    @Column(name = "medication_id")
    private Long medicationId;

    @Column(name = "code")
    private String code;

    @Column(name = "form")
    private String form;

    @Column(name = "body_site")
    private String bodySite;
}
