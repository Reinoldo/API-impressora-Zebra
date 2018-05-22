package br.com.dsg.zpl.elemento.core;

import br.com.dsg.zpl.elemento.conversor.ConversorMilimetrosParaPontos;

public enum UnidadeMedida {

	PONTOS(new Conversor() {
		public String converter(Valor valor, Parametros parametros) {
			return valor.getValor();
		}
	}),
	MILIMETROS( new ConversorMilimetrosParaPontos() ),
	CENTIMETRO( new ConversorMilimetrosParaPontos());
	
	private Conversor conversor;

	private UnidadeMedida(Conversor conversor) {
		this.conversor = conversor;
	}

	public Conversor getConversor() {
		return conversor;
	}
	
	
	
}
