package com.example.immunization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "provider")
public class ProviderEntity {
    @Id
    @SequenceGenerator(name = "provider_seq_id", sequenceName = "provider_seq_id", initialValue = 601, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "provider_seq_id")
    @Column(name = "provider_id")
    private Long providerId;

    @Column(name = "provider_name")
    private String providerName;
}
