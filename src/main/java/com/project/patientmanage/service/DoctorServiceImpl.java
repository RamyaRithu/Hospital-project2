package com.project.patientmanage.service;

import com.project.patientmanage.Rrepository.DoctorRapo;
import com.project.patientmanage.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl  implements DoctorService{


    @Autowired
    private DoctorRapo doctorRapo;


    @Override
    public List<Doctor> getAllDoctor() {
        return doctorRapo.findAll();
    }

    @Override
    public void saveDoctor(Doctor doctor) {
        doctorRapo.save(doctor);

    }

    @Override
    public Doctor getDoctorById(Long id) {
        Optional<Doctor> optional = doctorRapo.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }else{
            throw new RuntimeException("Doctor not found "+id);
        }
    }



    @Override
    public void updateDoctor(Long id, Doctor updatedDoctor) {

    }

    @Override
    public void deleteDoctor(Long id) {

    }
}
