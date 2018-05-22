package br.teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.dsg.zpl.elemento.core.Densidade;
import br.com.dsg.zpl.elemento.core.UnidadeMedida;
import br.com.dsg.zpl.elemento.core.ZPLBuilder;

public class TesteZLPPagina {

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
	public void testPagina() {
		String valor = ZPLBuilder.novaPagina(UnidadeMedida.MILIMETROS,Densidade.OITO_PONTOS, 70, 150)
				.escrever();

		System.out.println(valor);
		Assert.assertEquals(valor, "^XA^LL560^XZ");
	}
	
	@Test
	public void testPaginaMoldura() {
		String valor = ZPLBuilder.novaPagina(UnidadeMedida.MILIMETROS,Densidade.OITO_PONTOS, 99, 150)
				.comMargem()
				.escrever();

		System.out.println(valor);
		Assert.assertEquals(valor, "^XA^LL792^FO8,8^GB792,1200,8,B^FS^XZ");
	}

	

}
