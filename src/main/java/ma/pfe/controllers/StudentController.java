package ma.pfe.controllers;

import ma.pfe.dtos.StudentDtos;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {
    private static final Logger LOG = LoggerFactory.getLogger(StudentController.class);

    private StudentService service;


    StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public long create(@RequestBody StudentDtos dtos) {

        LOG.debug("start method create : {}",dtos);
        long id = service.create(dtos);
        LOG.debug("end method create");
        return id;

    }

    @PutMapping
    public boolean update(@RequestBody StudentDtos dto) {
        LOG.debug("start method update: {}",dto);
        boolean id = service.update(dto);
        LOG.debug("end method update");
        return id;
    }

    @DeleteMapping
    public boolean delete(@PathVariable("id") long id) {
        LOG.debug("start method delete dto{}",id);
        boolean result=service.delete(id);
        LOG.debug("end method delete");
        return result;
    }

    @GetMapping
    public List<StudentDtos> selectAll() {
        LOG.debug("start method update");
        List result=service.readAll();
        LOG.debug("end method update");
      return result;
    }

}