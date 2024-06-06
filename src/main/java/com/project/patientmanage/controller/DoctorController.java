package com.project.patientmanage.controller;


import com.project.patientmanage.model.Doctor;
import com.project.patientmanage.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;


    @GetMapping("/ListOfDoctor")
    public String index(Model model) {
        List<Doctor> list = doctorService.getAllDoctor();
        model.addAttribute("doctorList", list);
        return "Doctor_list";
    }


    @GetMapping("/showAddDoctorForm/{id}")
    public  String showAddDoctorForm(Model model){
        //create  object
        Doctor  doctor=new Doctor();
        model.addAttribute("doctor",doctor);

        //resolve thymleaf template
        return  "add_doctor";
    }

    //save the data ->post method-
    @PostMapping("/saveDoctor")
    public  String saveDoctor(@ModelAttribute("doctor") Doctor doctor){
        doctorService.saveDoctor(doctor);

        //redirect to home page
        return  "redirect:/";

    }


}
