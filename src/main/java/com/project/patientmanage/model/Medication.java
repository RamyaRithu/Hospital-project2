package com.project.patientmanage.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.Name;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "medication")
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prescription;
    private String doctorDetail;
    private String patientDetail;


    @OneToMany(mappedBy = "medication")
    private Set<Patient> patients;


}
