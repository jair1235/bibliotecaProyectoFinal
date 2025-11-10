package co.edu.politecnicointernacional.biblioteca.repository.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.politecnicointernacional.biblioteca.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{
    List<Libro> findByAutor(String autor);
    List<Libro> findByAutorIgnoreCase(String autor);

}
