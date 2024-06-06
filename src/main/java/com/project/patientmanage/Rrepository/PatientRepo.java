package com.project.patientmanage.Rrepository;

import com.project.patientmanage.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepo extends JpaRepository<Patient,Long> {


}
