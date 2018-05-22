package br.teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.dsg.zpl.elemento.CampoAlfanumerico;
import br.com.dsg.zpl.elemento.Fonte;
import br.com.dsg.zpl.elemento.Posicao;
import br.com.dsg.zpl.elemento.core.Densidade;
import br.com.dsg.zpl.elemento.core.Dimensao;
import br.com.dsg.zpl.elemento.core.Rotacao;
import br.com.dsg.zpl.elemento.core.TipoFonte;
import br.com.dsg.zpl.elemento.core.UnidadeMedida;
import br.com.dsg.zpl.elemento.core.ZPLBuilder;


public class TesteZLP {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}



	@Test
	public void testFonte() {
		String valor = ZPLBuilder.novaPagina(UnidadeMedida.MILIMETROS,Densidade.OITO_PONTOS, 70, 150)
				.registra(new Fonte(12))
				.escrever();

		System.out.println(valor);
		Assert.assertEquals(valor, "^XA^LL560^CF0,96^XZ");

	}

	@Test
	public void testAlfa() {
		String valor = ZPLBuilder.novaPagina(UnidadeMedida.MILIMETROS,Densidade.OITO_PONTOS, 70, 150)
				.registra(new CampoAlfanumerico(new Posicao(10, 10), "Denis Giroto")
						.comRotacao(TipoFonte.A, Rotacao.I))
				.escrever();

		System.out.println(valor);
		Assert.assertEquals(valor, "^XA^LL560^FO80,80^AAI^FDDenis Giroto^FS^XZ");

	}

	@Test
	public void testFonteComAlfa() {
		Dimensao dimensao = new Dimensao(10, 10);
		
		String valor = ZPLBuilder
				.novaPagina(UnidadeMedida.MILIMETROS,Densidade.OITO_PONTOS, 70, 150)
				
				.registra(new Fonte(12))
				.registra(new CampoAlfanumerico(new Posicao(10, 10), "D")
						.comRotacao(TipoFonte.A, Rotacao.N)
						.comDimensao(dimensao))
				.registra(new CampoAlfanumerico(new Posicao(21, 10), "E")
						.comRotacao(TipoFonte.A, Rotacao.N)
						.comDimensao(dimensao))
				.registra(new CampoAlfanumerico(new Posicao(32, 10), "N")
						.comRotacao(TipoFonte.A, Rotacao.N)
						.comDimensao(dimensao))
				.registra(new CampoAlfanumerico(new Posicao(43, 10), "I")
						.comRotacao(TipoFonte.A, Rotacao.N)
						.comDimensao(dimensao))
				.escrever();

		System.out.println(valor);
		Assert.assertEquals(valor, "^XA^LL560^CF0,96^FO80,80^AAN,80,80^FDD^FS^FO168,80^AAN,80,80^FDE^FS^FO256,80^AAN,80,80^FDN^FS^FO344,80^AAN,80,80^FDI^FS^XZ");
	}

}
