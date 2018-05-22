package br.com.dsg.zpl.elemento;

import br.com.dsg.zpl.elemento.core.Dimensao;
import br.com.dsg.zpl.elemento.core.Rotacao;
import br.com.dsg.zpl.elemento.core.TipoFonte;

public class Linha {

	private Dimensao dimensaoCaractere;
	private TipoFonte tipoFonte;
	private Rotacao rotacao;
	private String texto;
	
	
	public Linha(Dimensao dimensaoCaractere, TipoFonte tipoFonte, Rotacao rotacao, String texto) {
		super();
		this.dimensaoCaractere = dimensaoCaractere;
		this.tipoFonte = tipoFonte;
		this.rotacao = rotacao;
		this.texto = texto;
	}
	public Dimensao getDimensaoCaractere() {
		return dimensaoCaractere;
	}
	public TipoFonte getTipoFonte() {
		return tipoFonte;
	}
	public Rotacao getRotacao() {
		return rotacao;
	}
	public String getTexto() {
		return texto;
	}

	
	
}
