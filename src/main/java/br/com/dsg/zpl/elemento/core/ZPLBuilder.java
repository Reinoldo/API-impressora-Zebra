package br.com.dsg.zpl.elemento.core;

public class ZPLBuilder  {

	public static Pagina novaPagina(UnidadeMedida unidadeMedida, Densidade densidade, int largura, int altura) {
		return new Pagina(new Parametros(unidadeMedida, densidade,  new Dimensao(largura, altura) )) ;
	}
}
