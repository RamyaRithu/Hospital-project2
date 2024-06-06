package com.project.patientmanage.controller;

import com.project.patientmanage.model.Appointment;
import com.project.patientmanage.model.Doctor;
import com.project.patientmanage.service.AppointmentService;
import com.project.patientmanage.service.DoctorService;
import com.project.patientmanage.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;



    @GetMapping("/ListOfAppointment")
    public String index(Model model) {
        List<Appointment> list = appointmentService.getAllAppointment();
        model.addAttribute("appointmentList", list);
        return "Appointment_list";
    }

    @GetMapping("/showAppointmentForm/{id}")
    public  String showAppointmentForm(Model model){

        Appointment appointment=new Appointment();
        model.addAttribute("appointment",appointment);

        //resolve thymleaf template
        return  "appointment";
    }

    //save the data of employee->post method-
    @PostMapping("/book")
    public  String book(@ModelAttribute("appointment") Appointment appointment){
        appointmentService.save(appointment);

        //redirect to home page
        return  "redirect:/";

    }
}
