package br.com.dsg.zpl.elemento.core;

import br.com.dsg.zpl.elemento.*;

public class TestMontar {

	public static void main(String[] args) {
		QRCode qr = new QRCode(new Posicao(300,2),2,8, "hahaha");

		Posicao pos = new Posicao(440,250);

		CodigoBarra bar = new CodigoBarra(new Posicao(15, 20),new Dimensao(1, 60), true," 123");

		Dimensao dimensaoCaractere = new Dimensao(3, 3);
		((Pagina)ZPLBuilder.novaPagina(UnidadeMedida.MILIMETROS,Densidade.SEIS_PONTOS, 379 , 375)
				.comMargem()
				.registra(bar)
				.registra(qr)
				.registra(new Imagem(new Posicao(630,10),new ImagemGRF("","CORREIOS.GRF"),1,1))

				.registra(new CampoAlfanumerico(new Posicao(400,250),"Contrato:").comDimensao(new Dimensao(5,5)))
				//.registra(new CampoAlfanumerico(pos, "123123").comDimensao(new Dimensao(5,5)))





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