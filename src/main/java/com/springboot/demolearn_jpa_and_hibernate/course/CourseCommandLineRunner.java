package com.springboot.demolearn_jpa_and_hibernate.course;

import com.springboot.demolearn_jpa_and_hibernate.Course;
import com.springboot.demolearn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.springboot.demolearn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.springboot.demolearn_jpa_and_hibernate.course.springdatajpa.CourseSpringJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
   private CourseSpringJPARepository courseRepository ;

    @Override
    public void run(String... args) throws Exception {
        courseRepository.save(new Course(1,"learn aws","ankit sinha"));
        courseRepository.save(new Course(2,"learn azure","sinha"));
        courseRepository.save(new Course(3,"learn google","ankit"));

        courseRepository.deleteById(1l);

        System.out.println(courseRepository.findById(2l));
        System.out.println(courseRepository.findById(3l));


    }
}
