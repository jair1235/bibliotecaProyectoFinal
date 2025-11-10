package co.edu.politecnicointernacional.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.politecnicointernacional.biblioteca.entity.Libro;
import co.edu.politecnicointernacional.biblioteca.repository.service.LibroRepository;
import co.edu.politecnicointernacional.biblioteca.repository.service.LibroService;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroRepository libroRepository;
	@Autowired
	private LibroService libroService;

    LibroController(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }
	
    @GetMapping
    public List<Libro> obtenerLibros() {
        return libroService.listarLibros();
    }
    @PostMapping
    public ResponseEntity<Libro> crearLibro(@RequestBody Libro libro) {
        Libro nuevoLibro = libroService.guardarLibro(libro);
        return new ResponseEntity<>(nuevoLibro, HttpStatus.CREATED);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerLibroPorId(@PathVariable Integer id) {
        var libro = libroRepository.findById(id);

        if (libro.isPresent()) {
            return ResponseEntity.ok(libro.get());
        } else {
            return ResponseEntity.status(404).body("Libro no encontrado");
        }
    }
    @GetMapping("/autor/{nombre}")
        public ResponseEntity<?> obtenerLibrosPorAutor(@PathVariable String nombre) {
        var libros = libroRepository.findByAutorIgnoreCase(nombre);

        if (libros.isEmpty()) {
            return ResponseEntity.status(404).body("No se encontraron libros del autor: " + nombre);
        } else {
            return ResponseEntity.ok(libros);
        }
    }
    
}
