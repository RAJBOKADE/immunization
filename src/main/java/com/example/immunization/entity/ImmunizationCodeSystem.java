package com.example.immunization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "immunization_code_system")

public class ImmunizationCodeSystem {

    @Id
    @SequenceGenerator(name = "immunization_code_system_seq_id", initialValue = 3001, sequenceName = "immunization_code_system_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "immunization_code_system_seq_id")
    private Long immunizationCodeSystemId;

    @Column(name = "code")
    private String code;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codes_system_id")
    private CodeSystemEntity codeSystemEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vaccine_id")
    private VaccineEntity vaccineEntity;

}
