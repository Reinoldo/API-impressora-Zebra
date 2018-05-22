package br.teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.dsg.zpl.elemento.Moldura;
import br.com.dsg.zpl.elemento.Posicao;
import br.com.dsg.zpl.elemento.core.Densidade;
import br.com.dsg.zpl.elemento.core.Dimensao;
import br.com.dsg.zpl.elemento.core.UnidadeMedida;
import br.com.dsg.zpl.elemento.core.ZPLBuilder;

public class TesteZLPMoldura {

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
	public void testlinha() {
		String valor = ZPLBuilder.novaPagina(UnidadeMedida.MILIMETROS,Densidade.OITO_PONTOS, 70, 150)
				.registra(new Moldura(new Posicao(10, 10),new Dimensao(30, 5),1)
						)
				.escrever();

		System.out.println(valor);
		Assert.assertEquals(valor, "^XA^LL560^FO80,80^GB240,40,8,B^FS^XZ");
	}

}
