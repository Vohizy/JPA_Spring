package com.vohizy.repository;

import com.vohizy.model.Students;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{
    @Override
    public List<Students> findAll() {
        return null;
    }

    @Override
    public Students add(Students s) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Students updateNamewById(Long id, String newName) {
        return null;
    }

    @Override
    public List<Students> findWhereNameLike(String query) {
        return null;
    }
}
