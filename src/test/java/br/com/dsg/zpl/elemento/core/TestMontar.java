package br.com.dsg.zpl.elemento.core;

import br.com.dsg.zpl.elemento.CaixaTexto;
import br.com.dsg.zpl.elemento.Linha;
import br.com.dsg.zpl.elemento.Posicao;

public class TestMontar {

	public static void main(String[] args) {
		Dimensao dimensaoCaractere = new Dimensao(3, 3);
		((Pagina)ZPLBuilder.novaPagina(UnidadeMedida.MILIMETROS,Densidade.OITO_PONTOS, 379 , 375).comMargem().registra(new CaixaTexto(new Posicao(10, 10),
							new Linha(new Dimensao(4, 4), TipoFonte.A, Rotacao.N, "DX_TES_DKSKS_SJ"),
							new Linha(new Dimensao(4, 4), TipoFonte.A, Rotacao.N, "LS"),
							new Linha(new Dimensao(4, 4), TipoFonte.A, Rotacao.N, "RB"),
							new Linha(new Dimensao(1, 1), TipoFonte.A, Rotacao.N, "Denis_Silva"),
							new Linha(new Dimensao(2, 2), TipoFonte.A, Rotacao.I, "Denis_Silva"),
							new Linha(new Dimensao(3, 3), TipoFonte.A, Rotacao.B, "Denis_Silva"),
							new Linha(new Dimensao(3, 3), TipoFonte.A, Rotacao.R, "Denis_Silva"),
							new Linha(new Dimensao(12, 12), TipoFonte.A, Rotacao.N, "Giroto")
							
							)
				)
				
				.registra(
						new CaixaTexto(new Posicao(80, 80), 
								new Linha(new Dimensao(4, 4), TipoFonte.A, Rotacao.N, "DX"),
								new Linha(new Dimensao(4, 4), TipoFonte.A, Rotacao.N, "LS"),
								new Linha(new Dimensao(4, 4), TipoFonte.A, Rotacao.N, "RB")
								
								)
					)
				
//				.registra(
//					new CaixaTexto(new Posicao(10, 25),dimensaoCaractere, TipoFonte.A, Rotacao.N, "De")
//				)
//				
//				.registra(
//					new CaixaTexto(new Posicao(20, 25),dimensaoCaractere, TipoFonte.A, Rotacao.N, "eD")
//				)
				
		).test();

	}

}
/*
 * .registra(new CampoAlfanumerico(new Posicao(10, 10), "D") .comRotacao("A",
 * "N") .comDimensao("10", "10")) .registra(new CampoAlfanumerico(new
 * Posicao(21, 10), "E") .comRotacao("A", "N") .comDimensao("10", "10"))
 * .registra(new CampoAlfanumerico(new Posicao(32, 10), "N") .comRotacao("A",
 * "N") .comDimensao("10", "10")) .registra(new CampoAlfanumerico(new
 * Posicao(43, 10), "I") .comRotacao("A", "N") .comDimensao("10", "10"))
 */