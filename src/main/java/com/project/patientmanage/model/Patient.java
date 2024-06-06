package com.project.patientmanage.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String ph_Number;
    private String email;
    private String location;
    private String medicalHistory;

    @OneToMany(mappedBy = "patient")
    private Set<Appointment> appointments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prescription")
    private Medication medication;

}
