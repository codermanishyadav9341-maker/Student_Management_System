package org.example.student_management_system.Service;


import org.example.student_management_system.Model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Logic layer hai StudentService class;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    Student updateStudent(Long id ,Student student);

    void deleteStudent(Long id);
}
