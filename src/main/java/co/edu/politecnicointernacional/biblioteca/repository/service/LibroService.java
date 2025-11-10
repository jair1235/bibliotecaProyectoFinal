package co.edu.politecnicointernacional.biblioteca.repository.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.politecnicointernacional.biblioteca.entity.Libro;
@Service
public class LibroService {
	@Autowired
	private LibroRepository	libroRepo;

	public List<Libro> listarLibros() {
        return libroRepo.findAll();
    }

    public Libro guardarLibro(Libro libro) {
        return libroRepo.save(libro);
    }
    
}
