package com.project.patientmanage.service;

import com.project.patientmanage.Rrepository.AppointmentRepo;
import com.project.patientmanage.Rrepository.DoctorRapo;
import com.project.patientmanage.Rrepository.PatientRepo;
import com.project.patientmanage.model.Appointment;
import com.project.patientmanage.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {


    @Autowired
    private AppointmentRepo appointmentRepo;



    public void save(Appointment appointment)
    {
        appointmentRepo.save(appointment);
    }

    public List<Appointment> getAllAppointment(){
        return appointmentRepo.findAll();
    }


}
