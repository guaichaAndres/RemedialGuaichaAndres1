package ec.ups.edu.appdis1.RemedialGuaichaAndres.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria {
	private static final long serialVersionUID = 1L;
	@Id
private int categoriaId;
private String nombreCategoriaId;
public int getCategoriaId() {
	return categoriaId;
}
public void setCategoriaId(int categoriaId) {
	this.categoriaId = categoriaId;
}
public String getNombreCategoriaId() {
	return nombreCategoriaId;
}
public void setNombreCategoriaId(String nombreCategoriaId) {
	this.nombreCategoriaId = nombreCategoriaId;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
}
