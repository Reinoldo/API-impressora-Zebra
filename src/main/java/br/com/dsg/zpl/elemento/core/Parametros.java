package br.com.dsg.zpl.elemento.core;

/**
 * @author denisgiroto
 *
 */
public class Parametros {

	private UnidadeMedida unidadeMedida = UnidadeMedida.PONTOS;
	private Densidade densidade;
	private Dimensao dimensao;
	

	public Parametros(UnidadeMedida unidadeMedida, Densidade densidade, Dimensao dimensao) {
		super();
		this.unidadeMedida = unidadeMedida;
		this.densidade = densidade;
		this.dimensao = dimensao;
	}

	public Densidade getDensidade() {
		return densidade;
	}

	public Dimensao getDimensao() {
		return dimensao;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	void setDensidade(Densidade densidade) {
		this.densidade = densidade;
	}

	void setDimensao(Dimensao dimensao) {
		this.dimensao = dimensao;
	}

	
	
}
