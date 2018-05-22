package br.com.dsg.zpl.elemento;

import br.com.dsg.zpl.elemento.core.Dimensao;
import br.com.dsg.zpl.elemento.core.GerenciadorElemento;

/**
 * @author denisgiroto
 *
 */
public class CaixaTexto extends ComandoSimples {


	private Linha[] valor;

	

	/**
	 * @param posicao
	 * @param tipoFonte  A,B,C,D,E,F,G,H
	 * @param rotacao  N,R,I e B
	 * @param altura
	 * @param largura
	 * @param valor
	 */
	public CaixaTexto(Posicao posicao, Linha... valor) {
		super(posicao);
		this.valor = valor;
	}

	

	@Override
	protected void montaCampo(GerenciadorElemento gerenciador) {

		
		int margemX = 0;
		int margemY = 0;
		
		int proximoY = getPosicao().getVertical();
		
		Dimensao maiorDimensao = null;
		
		for (int l = 0; l < valor.length; l++) {
			Linha linha = valor[l];
			
			
			int proximoX = getPosicao().getHorizontal();
			
			for (int c = 0; c < linha.getTexto().length(); c++) {
				String caractere = linha.getTexto().charAt(c)+"";
				
				
				
				
				gerenciador.registra(new CampoAlfanumerico(
							new Posicao(proximoX, proximoY), 
							linha.getDimensaoCaractere(), linha.getTipoFonte(), linha.getRotacao(), caractere) );
				
				
				
				
				proximoX += linha.getDimensaoCaractere().getLargura() ;
				
				int larguraLinha = linha.getDimensaoCaractere().getLargura() * linha.getTexto().length();
				if(maiorDimensao==null | margemX< larguraLinha ) {
					maiorDimensao = linha.getDimensaoCaractere();
					margemX = larguraLinha;
				}
			
			}
			
			proximoY +=linha.getDimensaoCaractere().getAltura()+2;
		}
		
		margemY = proximoY-getPosicao().getVertical();//(dimensaoCaractere.getAltura()+2) * valor.length;
		
		gerenciador.registra(
				new Moldura(
						new Posicao(getPosicao().getHorizontal()-1, getPosicao().getVertical()-2),
						new Dimensao( margemX+2, margemY+2 ),
						0) 
		);

	}


}
