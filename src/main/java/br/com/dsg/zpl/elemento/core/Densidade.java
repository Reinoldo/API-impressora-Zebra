package br.com.dsg.zpl.elemento.core;

public enum Densidade {

	SEIS_PONTOS(6),
	OITO_PONTOS(8),
	DOZE_PONTOS(12);
	
	private int pontos;

	Densidade(int pontos) {
		this.pontos = pontos;
	}

	public int getPontos() {
		return pontos;
	}
	
	
	
}
