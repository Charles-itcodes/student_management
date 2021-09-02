package se.lexicon.room1.data_access;

import org.springframework.stereotype.Component;
import se.lexicon.room1.models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDAO {

    List<Student> storage;

    public StudentDaoListImpl(List<Student> storage) {
        this.storage = storage;
    }

    @Override
    public Student save(Student student) {
        storage.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        return storage.stream()
                .filter(student -> student.getId() == id)
                .findFirst().orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Student> findAll() {
        return storage;
    }

    @Override
    public void delete(int id) {
        storage.remove(find(id));

    }
}