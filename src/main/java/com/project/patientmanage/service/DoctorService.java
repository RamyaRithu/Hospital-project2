package com.project.patientmanage.service;

import com.project.patientmanage.model.Doctor;

import java.util.List;

public interface DoctorService {

    List<Doctor> getAllDoctor();

    void saveDoctor(Doctor doctor);

    Doctor getDoctorById(Long id);

    void updateDoctor(Long id, Doctor updatedDoctor);

    void deleteDoctor(Long id);

}
