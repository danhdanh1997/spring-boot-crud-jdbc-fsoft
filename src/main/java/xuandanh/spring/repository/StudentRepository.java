package xuandanh.spring.repository;

import java.util.List;

import xuandanh.spring.model.Student;

public interface StudentRepository {
    int save(Student student);
    int update(Student student);
    int deleteById(Long id);
    List<Student> findAll();
    Student findById(Long id);
}