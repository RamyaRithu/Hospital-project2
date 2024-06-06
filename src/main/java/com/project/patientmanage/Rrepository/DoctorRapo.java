package com.project.patientmanage.Rrepository;

import com.project.patientmanage.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRapo extends JpaRepository<Doctor,Long> {


}
