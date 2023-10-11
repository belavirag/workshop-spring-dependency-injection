package dev.belavirag.workshop.di.service;

import dev.belavirag.workshop.di.data_access.StudentDao;
import dev.belavirag.workshop.di.models.Student;
import dev.belavirag.workshop.di.util.UserInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentManagementConsoleImpl implements StudentManagement {
    @Autowired
    private UserInputService scannerService;

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student create() {
        return new Student();
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student find(int id) {
        return studentDao.find(id);
    }

    @Override
    public Student remove(int id) {
        Student student = this.find(id);
        studentDao.delete(id); // does not return Student, we need to find it first, so we can return it

        return student;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        studentDao.delete(student.getId());
        studentDao.save(student);

        return student;
    }
}
