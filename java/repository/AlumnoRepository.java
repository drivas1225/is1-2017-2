package repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import domain.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, String>{
  List<Alumno> findAll();

  @Query("select a from Alumno a where a.nombres = ?1")
  Alumno findAlumnoName(String name);

}
