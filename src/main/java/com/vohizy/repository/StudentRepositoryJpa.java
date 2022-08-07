package com.vohizy.repository;

import com.vohizy.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoryJpa extends JpaRepository<Students,Long> {
}
