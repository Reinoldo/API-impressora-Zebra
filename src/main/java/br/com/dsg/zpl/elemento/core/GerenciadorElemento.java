package br.com.dsg.zpl.elemento.core;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorElemento {

	private List<Elemento> componentes;
	private Parametros parametros;
	
	
	
	public GerenciadorElemento() {
	}
	
	public GerenciadorElemento(Parametros parametros) {
		this.parametros = parametros;
	}

	List<Elemento> getComponentes() {
		if (this.componentes == null) {
			this.componentes = new ArrayList<Elemento>();
		}
		return componentes;
	}


	public GerenciadorElemento registra(Elemento componente) {
		if(componente!=null) {
			componente.setParametro(this.parametros);
			getComponentes().add(componente);
		}
		return this;
	}
}
