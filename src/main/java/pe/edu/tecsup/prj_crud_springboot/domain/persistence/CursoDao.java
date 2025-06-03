package pe.edu.tecsup.prj_crud_springboot.domain.persistence;

import pe.edu.tecsup.prj_crud_springboot.domain.entities.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoDao extends CrudRepository<Curso,Integer> {
}
