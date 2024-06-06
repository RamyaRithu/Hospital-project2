package com.project.patientmanage.controller;

import com.project.patientmanage.model.Patient;
import com.project.patientmanage.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/index")
    public  String index(){
        return "index";

    }

    @GetMapping("/showRegistrationForm/{id}")
    public  String showRegistrationForm(Model model){
        //create an employee object
        Patient patient=new Patient();
        model.addAttribute("patient",patient);

        //resolve thymleaf template
        return  "register";
    }


    @PostMapping("/savePatient")
    public  String saveEmployee(@ModelAttribute("patient")Patient patient){
        patientService.save(patient);

        //redirect to home page
        return  "redirect:index";

    }

}
