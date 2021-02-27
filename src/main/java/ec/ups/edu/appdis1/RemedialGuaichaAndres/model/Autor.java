package ec.ups.edu.appdis1.RemedialGuaichaAndres.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Autor {
	private static final long serialVersionUID = 1L;
	@Id
private int autorId;
private String nombreAutorId;
private String nacionalidadAutor;
private List<Libro> libro;
public int getAutorId() {
	return autorId;
}
public void setAutorId(int autorId) {
	this.autorId = autorId;
}
public String getNombreAutorId() {
	return nombreAutorId;
}
public void setNombreAutorId(String nombreAutorId) {
	this.nombreAutorId = nombreAutorId;
}
public String getNacionalidadAutor() {
	return nacionalidadAutor;
}
public void setNacionalidadAutor(String nacionalidadAutor) {
	this.nacionalidadAutor = nacionalidadAutor;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
}
