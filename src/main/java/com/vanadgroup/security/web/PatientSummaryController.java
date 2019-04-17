package com.vanadgroup.security.web;

import com.vanadgroup.security.model.Patient;
import com.vanadgroup.security.repository.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PatientSummaryController {

    private final PatientRepository patientRepository;

    public PatientSummaryController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping(value = "/patients/{id}/summary", produces = "text/html")
    public String summary(Model model, @PathVariable long id) {
        Patient patient = patientRepository.findOne(id);
        if (patient == null) {
            return "404";
        }
        model.addAttribute("patient", patient);
        return "patient-summary";
    }
}
