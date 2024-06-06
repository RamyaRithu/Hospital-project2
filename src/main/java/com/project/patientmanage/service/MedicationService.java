package com.project.patientmanage.service;

import com.project.patientmanage.Rrepository.MedicationRepo;
import com.project.patientmanage.model.Appointment;
import com.project.patientmanage.model.Medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationService {
  @Autowired
  private MedicationRepo medicationRepo;

    public void save(Medication Medication)
    {
        medicationRepo.save(Medication);
    }
  public List<Medication> getAllMedication(){
    return medicationRepo.findAll();
  }

}


