package dev.belavirag.workshop.di.data_access;

import dev.belavirag.workshop.di.models.Student;

import java.util.List;

public interface StudentDao {
    Student save(Student student);
    Student find(int id);
    List<Student> findAll();
    void delete(int id);
}
