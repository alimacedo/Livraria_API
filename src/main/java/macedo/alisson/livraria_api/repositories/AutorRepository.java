package macedo.alisson.livraria_api.repositories;

import macedo.alisson.livraria_api.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {
}