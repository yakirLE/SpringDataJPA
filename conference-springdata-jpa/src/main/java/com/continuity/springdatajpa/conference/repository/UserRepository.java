package com.continuity.springdatajpa.conference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.continuity.springdatajpa.conference.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
