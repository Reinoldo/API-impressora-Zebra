package br.com.dsg.zpl.elemento.conversor;

import br.com.dsg.zpl.elemento.core.Conversor;
import br.com.dsg.zpl.elemento.core.Parametros;
import br.com.dsg.zpl.elemento.core.Valor;

/**
 * @author denisgiroto
 *
 */
public class ConversorCentimetrosParaPontos implements Conversor{

	public String converter(Valor valor, Parametros parametros) {
		return converterMMparaPontos(parametros, Integer.valueOf(valor.getValor()));
	}
	
	protected String converterMMparaPontos(Parametros parametros, int milimetros) {
		return String.valueOf( parametros.getDensidade().getPontos() * milimetros );
	}

}
