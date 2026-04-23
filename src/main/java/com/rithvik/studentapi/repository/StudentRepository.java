package com.rithvik.studentapi.repository;

import com.rithvik.studentapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Find students by department
    List<Student> findByDepartment(String department);

    // Find student by email
    Optional<Student> findByEmail(String email);
}
