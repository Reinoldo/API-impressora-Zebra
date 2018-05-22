package br.com.dsg.zpl.elemento.core;

/**
 * @author denisgiroto
 *
 */
public abstract class ElementoComposto extends Elemento{

	
	private GerenciadorElemento gerenciador = null;
	
	public ElementoComposto() {
		super();
	}
	
	public ElementoComposto(Parametros parametros) {
		super(parametros);
	}


	protected abstract void montaElemento(GerenciadorElemento cadastro);
	

	protected String escrever(Parametros parametros) {
		this.gerenciador = new GerenciadorElemento(parametros);
		montaElemento(gerenciador);
		
		//System.out.println("ElementoComposto::escrever(parametros)");
		String str = new String();
		for (Elemento comp : gerenciador.getComponentes()) {
			//System.out.println(comp.getClass().getName());
			str+=comp.escrever(parametros);
			//System.out.println(str);
		}
		//System.out.println(str);
		return str;
	}
}
