package macedo.alisson.livraria_api.services;

import macedo.alisson.livraria_api.repositories.AutorRepository;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    private final AutorRepository repository;

    public AutorService(AutorRepository repository) {
        this.repository = repository;
    }
}
