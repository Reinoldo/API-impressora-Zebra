/**
 * 
 */
package br.com.dsg.zpl.elemento.core;

/**
 * @author denisgiroto
 *
 */
public class Dimensao {

	private int largura = 70;
	private int altura = 70;
	
	/**
	 * @param largura
	 * @param altura
	 */
	public Dimensao(int largura, int altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}
	
	public boolean validaValor(int valor) {
		return valor <= this.altura 	&& valor <= this.largura;
	}

	public int valorMenorSentido() {
		
		if(altura<largura) {
			
			return altura;
		}else {
			
			return  largura;
		}
	}

	@Override
	public String toString() {
		return "Dimensao [largura=" + largura + ", altura=" + altura + "]";
	}
	
	
	
}
