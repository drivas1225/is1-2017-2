package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.Alumno;
import repository.AlumnoRepository;

@Service
public class AlumnoService {

  @Autowired
  AlumnoRepository repository;

  public List<Alumno> getAll() {
    return repository.findAll();
  }

  public Alumno getByCodigo(String codigo) {
    return repository.findOne(codigo);
  }

  public Alumno save(Alumno alumnoChanged) {
    System.out.println("Modificando: " + alumnoChanged.getId());
    Alumno alumno = repository.findOne(alumnoChanged.getId());
    if (alumno != null) {
      alumno.setApellidoPaterno(alumnoChanged.getApellidoPaterno());
      alumno.setApellidoMaterno(alumnoChanged.getApellidoMaterno());
      alumno.setNombres(alumnoChanged.getNombres());
    } else {
      alumno = alumnoChanged;
    }

    return repository.save(alumno);
  }
}
