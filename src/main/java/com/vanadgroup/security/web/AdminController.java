package com.vanadgroup.security.web;

import org.springframework.security.access.annotation.Secured;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@RestController
public class AdminController {

    private final EntityManager entityManager;

    public AdminController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @PostMapping("/admin/patients/{id}/modify-bsn")
    @Secured("ROLE_ADMIN")
    @Transactional
    public void modifyBsn (@PathVariable String id, @RequestBody UpdateBsnRequest request) {
        Query query = entityManager.createQuery("UPDATE patient SET bsn = '" + request.getBsn() + "' WHERE id = " + id);
        query.executeUpdate();
    }

    @GetMapping(value = "/admin/export-ids", produces = "text/plain")
    @Secured("ROLE_ADMIN")
    @Transactional(readOnly = true)
    public String patientsAsCsv () {
        Query query = entityManager.createQuery("SELECT * FROM patient");
        List<Object[]> results = query.getResultList();
        StringBuilder builder = new StringBuilder();
        for (Object[] row : results) {
            builder.append(row[0] + "\r\n");
        }
        return builder.toString();
    }
}
