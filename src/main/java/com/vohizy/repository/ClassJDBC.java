package com.vohizy.repository;

import com.vohizy.model.Students;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ClassJDBC implements StudentRepository{
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Students> findAll() {
        String SQL ="select * from student;";
        List<Students> Allstudents = jdbcTemplate.query(SQL,new StudentMapper());
        return Allstudents;

    }

    @Override
    public Students add(Students s) {
        String SQL = String.format("INSERT INTO student (name, groups) VALUES (%s,%s)",s.getName(),s.getGroup());
        Students students=jdbcTemplate.queryForObject(SQL,new StudentMapper());
        return null;
    }

    @Override
    public void deleteById(Long id) {
        String SQL = "DELETE FROM student WHERE id=?";
        jdbcTemplate.update(SQL,id);
        return;
    }

    @Override
    public Students updateNamewById(Long id, String newName) {
        String SQL = String.format("UPDATE student SET name=%s WHERE id=%s",newName,id);
       Students student = jdbcTemplate.queryForObject(SQL,new StudentMapper());
        System.out.println("UPDATE is OK WITH id "+id);
        return student;
    }

    @Override
    public List<Students> findWhereNameLike(String query) {
        String SQL = String.format("select * from students where name like '%%s%'",query);
        List<Students> ListWhereNameLike = jdbcTemplate.query(SQL,new StudentMapper());
        return ListWhereNameLike;
    }
}
