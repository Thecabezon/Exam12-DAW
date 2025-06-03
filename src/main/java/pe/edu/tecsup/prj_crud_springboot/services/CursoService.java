package pe.edu.tecsup.prj_crud_springboot.services;

import java.util.List;
import pe.edu.tecsup.prj_crud_springboot.domain.entities.Curso;

public interface CursoService {

    public void grabar(Curso curso);
    public void eliminar(int id);
    public Curso buscar(Integer id);
    public List<Curso> listar();
}
