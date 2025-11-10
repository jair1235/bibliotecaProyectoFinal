package co.edu.politecnicointernacional.biblioteca.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    private String titulo;
	    private String autor;
	    private String editorial;

	    @Column(name = "fecha_publicacion")
	    private LocalDate fechaPublicacion;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getEditorial() {
			return editorial;
		}

		public void setEditorial(String editorial) {
			this.editorial = editorial;
		}

		public LocalDate getFechaPublicacion() {
			return fechaPublicacion;
		}

		public void setFechaPublicacion(LocalDate fechaPublicacion) {
			this.fechaPublicacion = fechaPublicacion;
		}

		public Libro() {
		}
	    
	    
}
