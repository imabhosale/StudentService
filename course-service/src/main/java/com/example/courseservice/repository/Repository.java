package com.example.courseservice.repository;

import com.example.courseservice.model.courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<courses,Long> {
}
