package com.continuity.springdatajpa.conference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.continuity.springdatajpa.conference.model.Registration;
import com.continuity.springdatajpa.conference.model.RegistrationReport;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    List<RegistrationReport> registrationReport();
}
