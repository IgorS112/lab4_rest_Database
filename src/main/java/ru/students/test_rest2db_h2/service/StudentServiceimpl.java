package ru.students.test_rest2db_h2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.students.test_rest2db_h2.dao.StudentDAO;
import ru.students.test_rest2db_h2.entity.Student;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceimpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    @Transactional
    public Student saveStudent(Student student) {
        return studentDAO.saveStudent(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }
}
