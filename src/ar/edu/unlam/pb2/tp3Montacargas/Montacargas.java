package ar.edu.unlam.pb2.tp3Montacargas;

import java.util.ArrayList;
import java.util.List;

public class Montacargas {
	private Double pesoMaximo;
	private List<Cargas>listaDeCargas;
	
	public Montacargas(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
		this.listaDeCargas = new ArrayList<Cargas>();
		
	}

	public Double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	
	public Boolean agregarCarga(Cargas nuevaCarga) {
		 if(!(listaDeCargas.contains(nuevaCarga)))
		   if(obtenerPesoCargado()+nuevaCarga.getPeso()<=this.pesoMaximo) {
			  return this.listaDeCargas.add(nuevaCarga);
		    }
	   
		return false;
	}
	
	public Double obtenerPesoCargado() {
		Double pesoTotalCargado=0.0;
		for(Cargas carga: listaDeCargas) {
			pesoTotalCargado+=carga.getPeso();
		}
		return pesoTotalCargado;
	}

	public Integer cantidadDeCargas() {
		return listaDeCargas.size();
	}



}
