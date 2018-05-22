package br.com.dsg.zpl.elemento;

public enum PadraoCodigoBarra {


	E("E"),
	ZERO("0"),
	UM("1");
	
	private String padrao;

	private PadraoCodigoBarra(String padrao) {

		this.padrao = padrao;
	}

	public String getPadrao() {
		return padrao;
	}
	
	
	
}
