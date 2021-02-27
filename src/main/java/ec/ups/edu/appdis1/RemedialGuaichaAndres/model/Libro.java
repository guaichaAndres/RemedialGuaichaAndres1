package ec.ups.edu.appdis1.RemedialGuaichaAndres.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int libroId;
private String tituloLibro;
private int stock;

@JoinColumn(name="cod_autor")
private List<Autor> autor;
@OneToOne
@JoinColumn(name="cod_categoria")
private Categoria categoria; 

public String getTituloLibro() {
	return tituloLibro;
}
public void setTituloLibro(String tituloLibro) {
	this.tituloLibro = tituloLibro;
}

public Categoria getCategoria() {
	return categoria;
}
public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}

public int getLibroId() {
	return libroId;
}
public void setLibroId(int libroId) {
	this.libroId = libroId;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}

}
