package br.com.dsg.zpl.elemento;

import br.com.dsg.zpl.elemento.core.ComandoGeral;
import br.com.dsg.zpl.elemento.core.Dimensao;
import br.com.dsg.zpl.elemento.core.GerenciadorElemento;
import br.com.dsg.zpl.elemento.core.Rotacao;
import javafx.geometry.Pos;

public class CodigoBarra extends ComandoSimples {

	//^BCo,h,f,g,e,m
	/*	o = rotação (N = normal, R = 90º, I = 180º, B = 270º)
		h = tamanho do código de barras em dots (1 a 32000)
		f = linha de interpretação ( yes e no)
		g = linha de interpretação acima (sim e não)
		e = checagem de digito UCC (Y e N ) - N padrão
		m = modo (N = sem modo, U = UCC case mode (olhar manual) )

	*/
	private ComandoGeral codigoBarra = new ComandoGeral("^BC");
	private ComandoGeral by = new ComandoGeral("^BY");

	private int moduloBy = 4;

	private Rotacao rotacao = Rotacao.N;
	private String interpretacao = "Y";
	private Boolean interpretacaoEmCima = Boolean.FALSE;
	private String valor = null;
	private Dimensao dimensao;

	public CodigoBarra(Posicao posicao, Dimensao dimensao, Boolean interEmCima, String valor) {
		super(posicao);
		this.dimensao = dimensao;
		this.valor = valor;
		this.interpretacaoEmCima = interEmCima;
	}

	public CodigoBarra(Posicao posicao, Dimensao dimensao, String valor) {
		super(posicao);
		this.dimensao = dimensao;
		this.valor = valor;

	}



	/*public CodigoBarra comPadrao(PadraoCodigoBarra padrao) {

		this.padrao = padrao;
		return this;
	}*/


	@Override
	protected void montaCampo(GerenciadorElemento gerenciador) {
		by.comValor(this.moduloBy);
		gerenciador.registra(by);

		//codigoBarra.comValor( this.padrao.getPadrao()+""+this.rotacao.name() );
		codigoBarra.comValor(this.rotacao.name());
		codigoBarra.comValor( this.dimensao.getAltura(), false );

		codigoBarra.comValor( this.interpretacao);
		codigoBarra.comValor( this.interpretacaoEmCima);
		if(interpretacaoEmCima) {
			codigoBarra.comValor( "Y" );
		}else {
			codigoBarra.comValor( "N" );
		}

		gerenciador.registra(codigoBarra);
		
		
		gerenciador.registra( new Texto(this.valor ));
	}

}
