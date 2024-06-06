package com.project.patientmanage.Rrepository;

import com.project.patientmanage.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,Long> {


}
