package br.com.dsg.zpl.elemento.core;

/**
 * @author denisgiroto
 *
 */
public abstract class Elemento {

	
	private Parametros parametros;
	
	
	public Elemento() {
		super();
	//this.parametros = new Parametros(UnidadeMedida.PONTOS, Densidade.OITO_PONTOS, new Dimensao(800, 1000));
	}
	
	public Elemento(Parametros parametros) {
		super();
		this.parametros = parametros;
	}


	void setParametro( Parametros parametros ) {
		this.parametros = parametros;
	}
	
	
	public String escrever() {
		return escrever(this.parametros);
	}
	
	
	protected Parametros getParametros() {
		return parametros;
	}

	protected abstract String escrever(Parametros parametros);
}
