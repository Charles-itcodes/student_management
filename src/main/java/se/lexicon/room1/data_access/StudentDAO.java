package se.lexicon.room1.data_access;

import se.lexicon.room1.models.Student;

import java.util.Collection;


    public interface StudentDAO {

        Student save(Student student);
        Student find(int id);
        Collection<Student> findAll();
        void delete(int id);

    }
