package com.springboot.demolearn_jpa_and_hibernate.course.springdatajpa;

import com.springboot.demolearn_jpa_and_hibernate.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringJPARepository extends JpaRepository<Course,Long> {



}
