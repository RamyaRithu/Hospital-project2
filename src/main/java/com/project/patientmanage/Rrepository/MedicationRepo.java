package com.project.patientmanage.Rrepository;

import com.project.patientmanage.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepo extends JpaRepository<Medication,Long> {
}
