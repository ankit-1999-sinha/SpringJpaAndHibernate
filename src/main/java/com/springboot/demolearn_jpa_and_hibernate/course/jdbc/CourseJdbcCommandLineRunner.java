package com.springboot.demolearn_jpa_and_hibernate.course.jdbc;

import com.springboot.demolearn_jpa_and_hibernate.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
   private CourseJdbcRepository courseJdbcRepository ;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1,"learn aws","ankit sinha"));
        courseJdbcRepository.insert(new Course(2,"learn azure","sinha"));
        courseJdbcRepository.insert(new Course(3,"learn google","ankit"));

        courseJdbcRepository.deleteByID(1);

        System.out.println(courseJdbcRepository.findByID(2));


    }
}
