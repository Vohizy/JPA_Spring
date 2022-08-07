package com.vohizy.repository;

import com.vohizy.model.Students;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface StudentRepository {
    List<Students> findAll();
    Students add(Students s);
    void deleteById(Long id);
    Students updateNamewById(Long id, String newName);
    List<Students>findWhereNameLike(String query);
    //select * from students where name like '%query%'
}
