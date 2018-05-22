package br.com.dsg.zpl.elemento.core;

import br.com.dsg.zpl.elemento.Moldura;
import br.com.dsg.zpl.elemento.Posicao;

/**
 * @author denisgiroto
 *
 */
public class Pagina extends ElementoComposto{


	
	private Boolean margem = Boolean.FALSE;
	
	private GerenciadorElemento listaElemento = new GerenciadorElemento(null);
	
	public Pagina() {
		super();
	}
	
	public Pagina(Parametros parametros) {
		super(parametros);
	}
	
	public Pagina comMargem() {
		this.margem = Boolean.TRUE;
		return this;
	}
	
	@Override
	public String escrever(Parametros parametros) {
		return "^XA"
				+super.escrever(parametros)
			   +"^XZ";
	}

	@Override
	protected void montaElemento(GerenciadorElemento gerenciador) {
		gerenciador.registra(
			new ComandoGeral(
					"^LL", 
					new Valor(
							this.getParametros().getDimensao().getLargura() , 
							true
							) 
					)
		);
		
		if(margem) {
			
			gerenciador.registra(
				new Moldura(
						new Posicao(1, 1), 
						this.getParametros().getDimensao(), 
						1)
			);
		}
		
		for (Elemento elemento : listaElemento.getComponentes()) {
			gerenciador.registra(elemento);
		}
			
	}
	
	public void test() {
		String zpl = escrever();
		System.out.println(zpl.replace("^", "\n^"));
		Browser.get(this.getParametros().getDensidade(), zpl);
	}

	
	public Pagina registra(Elemento elemento) {
		listaElemento.registra(elemento);
		return this;
	}

}
