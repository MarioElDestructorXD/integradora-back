package mx.edu.utez.integradora.infrastructure.repository;

import mx.edu.utez.integradora.domain.entities.Problema;
import mx.edu.utez.integradora.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProblemaRepository extends JpaRepository<Problema, Integer> {
    List<Problema> findByUsuarioId(Integer usuarioId);
    List<Problema> findByCategoria(Problema.CategoriaProblema categoria);
    List<Problema> findByProveedorId(Integer proveedorId);


}
