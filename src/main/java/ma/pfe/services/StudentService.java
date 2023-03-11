package ma.pfe.services;

import ma.pfe.dtos.StudentDtos;

import java.util.List;

public interface StudentService {
    long create(StudentDtos dto);
    boolean update(StudentDtos dto);
    boolean delete(long dto);
    List<StudentDtos> readAll();


}
