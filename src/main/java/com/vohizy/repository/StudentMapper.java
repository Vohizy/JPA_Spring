package com.vohizy.repository;

import com.vohizy.model.Groups;
import com.vohizy.model.Students;
import org.aspectj.weaver.ast.Instanceof;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class StudentMapper implements RowMapper<Students> {
    @Override
    public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
        Students student= new Students();
        student.setId(rs.getLong("id"));
        student.setName(rs.getString("name"));
        student.setGroup(rs.getObject("group_id",Groups.class));
        return student;
    }
}
