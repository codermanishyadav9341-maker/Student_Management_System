package org.example.student_management_system.Service;

import org.example.student_management_system.Model.Student;
import org.example.student_management_system.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }

    @Override
    public Student updateStudent(Long id,Student student){
        Student existing = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        existing.setName(student.getName());
        existing.setEmail(student.getEmail());

        return studentRepository.save(existing);
    }

    @Override
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

}
