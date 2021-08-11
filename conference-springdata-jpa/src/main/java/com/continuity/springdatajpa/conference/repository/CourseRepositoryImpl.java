package com.continuity.springdatajpa.conference.repository;

import org.springframework.stereotype.Repository;

import com.continuity.springdatajpa.conference.model.Course;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Course save(Course course) {
        entityManager.persist(course);

        return course;
    }

}
