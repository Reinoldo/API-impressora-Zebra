package br.com.dsg.zpl.elemento;

import br.com.dsg.zpl.elemento.core.ComandoGeral;
import br.com.dsg.zpl.elemento.core.ElementoComposto;
import br.com.dsg.zpl.elemento.core.GerenciadorElemento;
import br.com.dsg.zpl.elemento.core.Parametros;

import java.io.IOException;

/**
 * @author denisgiroto
 *
 */
public abstract class ComandoSimples extends ElementoComposto{

	private Posicao posicao;
	private ComandoGeral comando;
	
	public ComandoSimples( Posicao posicao, ComandoGeral comando) {
		this.posicao = posicao;
		this.comando = comando;
	}
	
	public ComandoSimples( Posicao posicao ) {
		this.posicao = posicao;
	}
	
	public ComandoSimples(int vertical, int horizontal, ComandoGeral comando ) {
		this(new Posicao(vertical, horizontal), comando );
	}
	
	@Override
	protected void montaElemento(GerenciadorElemento gerenciador) {
		if(this.posicao !=null){

			gerenciador.registra(posicao);
		}
		
		if(this.comando!=null) {
			
			gerenciador.registra(this.comando);
		}
		
		montaCampo(gerenciador);
	}
	
	protected abstract void montaCampo(GerenciadorElemento gerenciador);
	
	@Override
	public String escrever(Parametros parametros) {
		//System.out.println("ComandoSimples::escrever(parametros)");
		String elemento = super.escrever(parametros);
		//System.out.println("elemento "+this.valor+ "^FS");
		return elemento+ "^FS";
	}

	protected Posicao getPosicao() {
		return posicao;
	}
	
	

}
