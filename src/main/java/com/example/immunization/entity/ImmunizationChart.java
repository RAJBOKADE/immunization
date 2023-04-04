package com.example.immunization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "immunization_chart")

public class ImmunizationChart {

    @Id
    @SequenceGenerator(name = "immunization_chart_seq_id", initialValue = 601, sequenceName = "immunization_chart_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "immunization_chart_seq_id")
    private Long immunizationChartId;

    @Column(name = "dose_intake_minimum_age")
    private Integer doseIntakeMinimumAge;

    @Column(name = "units")
    private String units;

    @Column(name = "recommended_interval_for_next_dose")
    private Integer recommendedIntervalForNextDose;

    @Column(name = "dependency")
    private String dependency;

    @Column(name = "dose_index")
    private Integer doseIndex;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vaccineId")
    private VaccineEntity vaccineEntity;

}
