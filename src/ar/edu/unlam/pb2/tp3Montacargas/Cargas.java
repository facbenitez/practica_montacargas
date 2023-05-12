package ar.edu.unlam.pb2.tp3Montacargas;

public class Cargas {
	private Double id;
	private Double peso;
	private String propietario;
	private String descripcion;

	public Cargas(double id, Double peso, String propietario) {
		this.id = id;
		this.peso = peso;
		this.propietario = propietario;
	
	}
	
	public Cargas() {
		this.id = 0.0;
		this.peso = 0.0;
		this.propietario ="";
		this.descripcion="";
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
