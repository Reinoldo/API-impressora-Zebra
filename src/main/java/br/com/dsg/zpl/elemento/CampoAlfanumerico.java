package br.com.dsg.zpl.elemento;

import br.com.dsg.zpl.elemento.core.ComandoGeral;
import br.com.dsg.zpl.elemento.core.Dimensao;
import br.com.dsg.zpl.elemento.core.GerenciadorElemento;
import br.com.dsg.zpl.elemento.core.Rotacao;
import br.com.dsg.zpl.elemento.core.TipoFonte;

/**
 * @author denisgiroto
 *
 */
public class CampoAlfanumerico extends ComandoSimples {

	private ComandoGeral comandoGeral = new ComandoGeral("^A");

	private TipoFonte tipoFonte;
	private Rotacao rotacao;
	private Dimensao dimensao;
	private String valor;

	public CampoAlfanumerico(Posicao posicao, String valor) {
		super(posicao);
		this.valor = valor;
	}

	public CampoAlfanumerico(Posicao posicao, Dimensao dimensao, TipoFonte tipoFonte, Rotacao rotacao,
			String valor) {
		super(posicao);
		this.tipoFonte = tipoFonte;
		this.rotacao = rotacao;
		this.dimensao = dimensao;
		this.valor = valor;
	}

	/**
	 * @param tipoFonte
	 *            A,B,C,D,E,F,G,H
	 * @param rotacao
	 *            N,R,I e B
	 * @return
	 */
	public CampoAlfanumerico comRotacao(TipoFonte tipoFonte, Rotacao rotacao) {
		this.tipoFonte = tipoFonte;
		this.rotacao = rotacao;
		return this;
	}

	public CampoAlfanumerico comDimensao(Dimensao dimensao) {
		this.dimensao = dimensao;
		return this;
	}

	@Override
	protected void montaCampo(GerenciadorElemento gerenciador) {

		if (tipoFonte != null && rotacao != null)
			comandoGeral.comValor(tipoFonte.name() + rotacao.name());
		
		if (dimensao != null)
			comandoGeral.comValor(dimensao);
		
		gerenciador.registra(comandoGeral);
		
		gerenciador.registra( new Texto (this.valor) 
		);

	}


}
