package com.project.patientmanage.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="doctor")
public class Doctor {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String doctorName;
    private String Specialization;
    private String degree;
    private String state;
    private String city;

 @OneToMany(mappedBy = "doctor")
 private Set<Appointment> appointments;


}
