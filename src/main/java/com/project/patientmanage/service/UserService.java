package com.project.patientmanage.service;


import com.project.patientmanage.dto.UserRegistrationDto;
import com.project.patientmanage.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

//configuration
public interface UserService  extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
