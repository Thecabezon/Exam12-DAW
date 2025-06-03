package pe.edu.tecsup.prj_crud_springboot.domain.persistence;

import pe.edu.tecsup.prj_crud_springboot.domain.entities.Auditoria;
import org.springframework.data.repository.CrudRepository;


public interface AuditoriaDao extends CrudRepository<Auditoria, Integer> {

}
