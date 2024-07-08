package com.minimalcode.jwt.controller;

import com.minimalcode.jwt.user.Role;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/resource")
public class ResourceController {
    @GetMapping("/hello")
    public String helloWorld() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return "Hello " + username;
    }
}
