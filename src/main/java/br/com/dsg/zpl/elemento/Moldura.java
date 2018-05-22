package br.com.dsg.zpl.elemento;

import br.com.dsg.zpl.elemento.core.ComandoGeral;
import br.com.dsg.zpl.elemento.core.Cor;
import br.com.dsg.zpl.elemento.core.Dimensao;
import br.com.dsg.zpl.elemento.core.GerenciadorElemento;

/**
 * @author denisgiroto
 * Imprimindo Linhas e Molduras
 *
 */
public class Moldura extends ComandoSimples {

	private ComandoGeral comandoGeral = new ComandoGeral("^GB");

	private Dimensao dimensao;
	private int  larguraCorFundo;
	private Cor   corFundo = Cor.B;

	/**
	 * @param posicao
	 * @param dimensao
	 * @param larguraCorFundo
	 * @param corFundo
	 */
	public Moldura(Posicao posicao, Dimensao dimensao, int larguraCorFundo, Cor corFundo) {
		super(posicao);
		this.dimensao = dimensao;
		this.larguraCorFundo = larguraCorFundo;
		if(corFundo!=null) {
			
			this.corFundo = corFundo;
		}
	}

	/**
	 * @param posicao
	 * @param dimensao
	 * @param larguraCorFundo
	 */
	public Moldura(Posicao posicao, Dimensao dimensao, int larguraCorFundo) {
		this(posicao, dimensao, larguraCorFundo, Cor.B);
	}

	@Override
	protected void montaCampo(GerenciadorElemento gerenciador) {

		comandoGeral.comValor(this.dimensao);
		
		if(  ! this.dimensao.validaValor( larguraCorFundo ) ) {
			
			larguraCorFundo = this.dimensao.valorMenorSentido();
		}
		
		comandoGeral.comValor( larguraCorFundo, getParametros().getUnidadeMedida().getConversor());
		comandoGeral.comValor( corFundo.name() );
		
		gerenciador.registra(comandoGeral);
		

	}


}
