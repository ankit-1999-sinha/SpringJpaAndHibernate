package com.springboot.demolearn_jpa_and_hibernate.course.jdbc;

import com.springboot.demolearn_jpa_and_hibernate.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static  String INSERT_QUERY  =
            """ 
                       insert into course (id,name,author) values(?,?,?);
            """;


    private static  String DELETE_QUERY  =
            """ 
                       delete from course where id = ?;
            """;

    private static  String SELECT_QUERY_BY_ID  =
            """ 
                       select * from course where id = ?;
            """;

    public void deleteByID(long id){
        jdbcTemplate.update(DELETE_QUERY,id);
    }

    public void insert(Course course){


        jdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public Course findByID(long id){


       return  jdbcTemplate.queryForObject(SELECT_QUERY_BY_ID,new BeanPropertyRowMapper<>(Course.class),id);
        // Result Set to bean mapping
        // ROW Mappers help to map result set to bean
    }


}
