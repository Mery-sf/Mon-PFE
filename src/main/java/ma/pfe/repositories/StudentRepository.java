package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {
    long create(StudentEntity e);
    boolean update(StudentEntity e);
    boolean delete(long id);
    List<StudentEntity> readall();
}
