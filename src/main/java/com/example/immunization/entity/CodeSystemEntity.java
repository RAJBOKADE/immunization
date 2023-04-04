package com.example.immunization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "codes_system")

public class CodeSystemEntity {

    @Id
    @SequenceGenerator(name = "codes_system_seq_id", initialValue = 1, sequenceName = "codes_system_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "codes_system_seq_id")
    private Long codeSystemId;

    @Column(name = "code")
    private String code;

    @Column(name = "display_name")
    private String displayName;

}
