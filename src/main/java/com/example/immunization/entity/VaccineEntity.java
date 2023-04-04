package com.example.immunization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vaccine")

public class VaccineEntity {

    @Id
    @SequenceGenerator(name = "vaccine_seq_id", initialValue = 501, sequenceName = "vaccine_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vaccine_seq_id")
    private Long vaccineId;

    @Column(name = "vaccine_name")
    private String vaccineName;

    @Column(name = "abbreviation")
    private String abbreviation;

    @Column(name = "description")
    private String description;

    @Column(name = "isMandatory")
    private boolean isMandatory;

    @Column(name = "active")
    private Integer active;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gender_id")
    private GenderEntity genderEntity;
}
