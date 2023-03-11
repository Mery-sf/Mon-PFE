package ma.pfe.services;

import ma.pfe.dtos.StudentDtos;
import ma.pfe.repositories.StudentRepositoryIml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentService service;
    @Override
    public long create(StudentDtos dtos){
        LOG.debug("start methode Create");
        Long result= service.create(dtos);
        LOG.debug("end methode Create");
        return result;
    }

    @Override
    public boolean update(StudentDtos dto) {
        LOG.debug("start methode Update");
        Boolean result= service.update(dto);
        LOG.debug("end methode Update");
        return result;
    }

    @Override
    public boolean delete(long dto) {
        LOG.debug("start methode Delete");
        Boolean result= service.delete(dto);
        LOG.debug("end methode Delete");
        return result;
    }

    @Override
    public List<StudentDtos> readAll() {
        LOG.debug("start methode Read All");
        List result= service.readAll();
        LOG.debug("end methode read All");
        return result;
    }
    private static final Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);

}
