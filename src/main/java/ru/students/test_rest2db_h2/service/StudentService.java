package ru.students.test_rest2db_h2.service;


import org.springframework.stereotype.Service;
import ru.students.test_rest2db_h2.entity.Student;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);

}
