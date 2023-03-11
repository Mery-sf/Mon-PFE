package ma.pfe.mappers;

import ma.pfe.dtos.StudentDtos;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
   StudentDtos convertEntitytoDto(StudentEntity entity){
       StudentDtos studentDtos = new StudentDtos();
       studentDtos.setName(entity.getName());
       studentDtos.setId(entity.getId());
       return studentDtos;
   }
   StudentEntity convertdtotoEntity(StudentDtos dto){
       StudentEntity studentEntity = new StudentEntity();
       studentEntity.setName(studentEntity.getName());
       studentEntity.setId(studentEntity.getId());
       return studentEntity;
   }
   List<StudentEntity> convertDtotoEntities(List<StudentDtos> dtos){
       return dtos.stream()
               .map(dto -> convertdtotoEntity(dto))
               .collect(Collectors.toList());
   }
   List<StudentDtos> convertEntitytoDto(List<StudentEntity> entities){
       return entities.stream()
               .map(entity -> convertEntitytoDto(entity))
               .collect(Collectors.toList());
   }
   }
