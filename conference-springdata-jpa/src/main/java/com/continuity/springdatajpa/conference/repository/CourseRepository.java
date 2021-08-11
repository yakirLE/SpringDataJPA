package com.continuity.springdatajpa.conference.repository;

import com.continuity.springdatajpa.conference.model.Course;

public interface CourseRepository {
    Course save(Course course);
}
