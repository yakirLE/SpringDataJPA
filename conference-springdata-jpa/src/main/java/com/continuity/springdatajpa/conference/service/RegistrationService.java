package com.continuity.springdatajpa.conference.service;

import javax.transaction.Transactional;

import com.continuity.springdatajpa.conference.model.Registration;
import com.continuity.springdatajpa.conference.model.RegistrationReport;

import java.util.List;

public interface RegistrationService {
    @Transactional
    Registration addRegistration(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();
}
