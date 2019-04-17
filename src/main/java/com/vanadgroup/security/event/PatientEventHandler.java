package com.vanadgroup.security.event;

import com.vanadgroup.security.model.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleAfterSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@RepositoryEventHandler
@Component
@Slf4j
public class PatientEventHandler {

    @HandleAfterCreate
    public void onCreated(Patient patient) {
        log.info("created {}", patient);
    }

    @HandleAfterSave
    public void onSaved(Patient patient) {
        log.info("saved {}", patient);
    }

    @HandleAfterDelete
    public void onDeleted(Patient patient) {
        log.info("deleted {}", patient);
    }

}
