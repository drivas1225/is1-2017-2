package repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import domain.Curso;

public interface CursoRepository extends CrudRepository<Curso, String>{
  List<Curso> findAll();
}