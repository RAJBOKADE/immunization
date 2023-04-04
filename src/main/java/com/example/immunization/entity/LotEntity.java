package com.example.immunization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lot")

public class LotEntity {

    @Id
    @SequenceGenerator(name = "lot_seq_id", initialValue = 6001, sequenceName = "lot_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lot_seq_id")
    private Long lotId;

    @Column(name = "lot_name")
    private String lotName;

    @Column(name = "lot_number")
    private String lotNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manufacturer_id")
    private ManufacturerEntity manufacturerEntity;



}
