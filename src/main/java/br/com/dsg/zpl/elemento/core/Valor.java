package br.com.dsg.zpl.elemento.core;

/**
 * @author denisgiroto
 *
 */
public class Valor {

	private String valor;
	private boolean converterUnidade = false;
	private Conversor conversor;
	
	

	/**
	 * @param valor
	 * @param converterUnidade
	 * @param conversor
	 */
	public Valor(String valor, boolean converterUnidade, Conversor conversor) {
		super();
		if(valor==null || valor.isEmpty()) {
			throw new RuntimeException();
		}
		this.valor = valor;
		this.converterUnidade = converterUnidade;
		this.conversor = conversor;
	}

	/**
	 * @param valor
	 * @param converterUnidade
	 * @param conversor
	 */
	public Valor(Integer valor,boolean converterUnidade, Conversor conversor) {
		this(valor.toString(),converterUnidade, conversor);
	}
	
	/**
	 * @param valor
	 * @param converterUnidade
	 */
	public Valor(Integer valor, boolean converterUnidade) {
		this(valor.toString(),converterUnidade, null);
	}
	
	/**
	 * @param valor
	 * @param converterUnidade
	 */
	public Valor(String valor, boolean converterUnidade) {
		this(valor,converterUnidade, null);
	}
	
	/**
	 * @param valor
	 */
	public Valor(Integer valor) {
		this(valor.toString(),false,null);
	}
	
	/**
	 * @param valor
	 */
	public Valor(String valor) {
		this(valor,false,null);
	}
	
	public String getValor() {
		return valor;
	}

	protected String get(Parametros parametros) {
		
		Valor clone = new Valor(this.valor, converterUnidade, conversor);
		
		if(converterUnidade) {
			
			clone.valor = parametros.getUnidadeMedida().getConversor().converter(this, parametros);
		}
		
		if(conversor!=null) {
		
			clone.valor = this.conversor.converter(clone, parametros);
		}
		return clone.valor;
	}
	
	
}
