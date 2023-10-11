package dev.belavirag.workshop.di.data_access;

import dev.belavirag.workshop.di.models.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao{
    List<Student> students;

    public StudentDaoImpl() {
        this.students = new ArrayList<>();
    }

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        return students
                .stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return this.students;
    }

    @Override
    public void delete(int id) {
        Student student = this.find(id);
        if (student == null) {
            return;
        }
        this.students.remove(student);
    }
}
