package com.example.immunization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "practice")
public class PracticeEntity {
    @Id
    @SequenceGenerator(name = "practice_seq_id", sequenceName = "practice_seq_id", initialValue = 701, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "practice_seq_id")
    @Column(name = "practice_id")
    private Long practiceId;

    @Column(name = "practice_name")
    private String practiceName;
}