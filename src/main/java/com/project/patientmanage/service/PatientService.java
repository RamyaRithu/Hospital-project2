package com.project.patientmanage.service;


import com.project.patientmanage.Rrepository.PatientRepo;
import com.project.patientmanage.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {


    @Autowired
    private PatientRepo patientRepo;

    public List<Patient> getAllPatients()
    {
        List<Patient> patientList = patientRepo.findAll();
        return patientList;
    }

    public void save(Patient patient)
    {
        patientRepo.save(patient);
    }

    public Patient findById(long id)
    {
        Patient newPatient =null;
        Optional<Patient> patient = patientRepo.findById(id);
        if(patient.isPresent())
        {
            newPatient = patient.get();
        }
        return newPatient;
    }


    public void deleteById(long id)
    {
        patientRepo.deleteById(id);
    }
}
