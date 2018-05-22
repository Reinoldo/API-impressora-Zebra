package br.com.dsg.zpl.elemento;

import br.com.dsg.zpl.elemento.core.ComandoGeral;

public class Texto extends ComandoGeral {

	public Texto(String texto) {
		super("^FD");
		
		comValor(texto);
	}
	

}
