package com.project.patientmanage.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String email;
         private String patientName;
     private String doctorName;
        private String Specialization;

        private LocalDateTime dateTime;
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "doctor_id" )
        private Doctor doctor;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "patient_id")
        private Patient patient;



}
