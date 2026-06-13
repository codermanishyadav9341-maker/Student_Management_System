package org.example.student_management_system.Repository;

import org.example.student_management_system.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository CRUD operations method use karta hai;
public interface StudentRepository extends JpaRepository<Student,Long> {
}
