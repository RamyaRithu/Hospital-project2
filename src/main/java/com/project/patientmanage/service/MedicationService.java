package com.project.patientmanage.service;

import com.project.patientmanage.Rrepository.MedicationRepo;
import com.project.patientmanage.model.Appointment;
import com.project.patientmanage.model.Medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

  public Medication getMedicationById(Long id) {
    Optional<Medication> optional = medicationRepo.findById(id);
    if(optional.isPresent()){
      return optional.get();
    }else{
      throw new RuntimeException("Medication not found "+id);
    }
  }

  public void updateMedication(Long id, Medication updateMedication) {
    Optional<Medication> optionalMedication = medicationRepo.findById(id);
    if (optionalMedication.isPresent()) {
      Medication existingMedication = optionalMedication.get();
      existingMedication.setPrescription(updateMedication.getPrescription());
      existingMedication.setDoctorDetail(updateMedication.getDoctorDetail());
      existingMedication.setPatientDetail(updateMedication.getPatientDetail());
      // Update other fields as needed
      medicationRepo.save(existingMedication);
    }



  }
  public void deleteMedication(Long id) {

    medicationRepo.deleteById(id);
  }

}


