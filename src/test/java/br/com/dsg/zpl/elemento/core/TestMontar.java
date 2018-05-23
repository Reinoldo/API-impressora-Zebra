package br.com.dsg.zpl.elemento.core;

import br.com.dsg.zpl.elemento.*;

public class TestMontar {

	public static void main(String[] args) {
		QRCode qr = new QRCode(new Posicao(150,2),2,10, "hahaha");

		CodigoBarra bar = new CodigoBarra(new Posicao(5, 10),new Dimensao(1, 50), true," 1234567890");

		Dimensao dimensaoCaractere = new Dimensao(3, 3);
		((Pagina)ZPLBuilder.novaPagina(UnidadeMedida.MILIMETROS,Densidade.SEIS_PONTOS, 379 , 375)
				.comMargem()
				.registra(bar)
				//.registra(qr)
				//.registra(new Imagem(new Posicao(250,10),new ImagemGRF("","SEDEX10.GRF")))

				

				

				
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