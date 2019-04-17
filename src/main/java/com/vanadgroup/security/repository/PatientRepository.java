package com.vanadgroup.security.repository;

import com.vanadgroup.security.model.Patient;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@RepositoryRestResource
@PreAuthorize("hasRole('USER')")
public interface PatientRepository extends PagingAndSortingRepository<Patient, Long> {

    Patient findByBsn(@Param("bsn") String bsn);

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    void deleteAll();
}
