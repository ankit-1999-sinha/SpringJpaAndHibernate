package com.springboot.demolearn_jpa_and_hibernate.course;

import com.springboot.demolearn_jpa_and_hibernate.Course;
import com.springboot.demolearn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.springboot.demolearn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
   private CourseJpaRepository courseRepository ;

    @Override
    public void run(String... args) throws Exception {
        courseRepository.insert(new Course(1,"learn aws","ankit sinha"));
        courseRepository.insert(new Course(2,"learn azure","sinha"));
        courseRepository.insert(new Course(3,"learn google","ankit"));

        courseRepository.deleteByID(1);

        System.out.println(courseRepository.findByID(2));


    }
}
