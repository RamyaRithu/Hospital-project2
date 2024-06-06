package com.project.patientmanage.controller;

import com.project.patientmanage.model.Doctor;
import com.project.patientmanage.model.Medication;
import com.project.patientmanage.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MedicationController {

    @Autowired
    private MedicationService medicationService;


    @GetMapping("/ListOfMedication")
    public String index(Model model) {
        List<Medication> list = medicationService.getAllMedication();
        model.addAttribute("medication", list);
        return "Medication_list";
    }


    @GetMapping("/showAddMedicationForm/{id}")
    public  String showAddMedicationForm(Model model){
        //create  object
        Medication  medication=new Medication();
        model.addAttribute("medication",medication);

        //resolve thymleaf template
        return  "add_medication";
    }

    //save the data ->post method-
    @PostMapping("/saveMedication")
    public  String saveDoctor(@ModelAttribute("medication") Medication medication){
        medicationService.save(medication);

        //redirect to home page
        return  "redirect:/";

    }



}
