package br.com.dsg.zpl.elemento;

import br.com.dsg.zpl.elemento.core.ComandoGeral;
import br.com.dsg.zpl.elemento.core.ElementoComposto;
import br.com.dsg.zpl.elemento.core.GerenciadorElemento;
import br.com.dsg.zpl.elemento.core.Valor;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author denisgiroto
 *
 */
public class ImagemGRF extends ElementoComposto implements Image{


	String nomeArquivo;
	String caminho;
	String conteudo;


	public ImagemGRF(String caminho, String nomeArquivo ) {
		this.caminho="resources/zebra";//caminho;
		this.nomeArquivo = nomeArquivo;

	}

	@Override
	protected void montaElemento(GerenciadorElemento gerenciador) {

		this.conteudo = lerArquivo();

		gerenciador.registra(
				new ComandoGeral(this.conteudo )
		);
	}

	public String getNomeImagem(){
		return this.nomeArquivo;
	}



	private String lerArquivo() {
		try {
			String nomeArquivo = this.caminho+"/"+this.nomeArquivo;
			FileReader isr = new FileReader(nomeArquivo);
			BufferedReader buffer = new BufferedReader(isr);

			String linha = null;

			StringBuffer str = new StringBuffer();

			while ((linha = buffer.readLine()) != null) {
				str.append(linha);
			}
			buffer.close();
			isr.close();


			return str.toString();
		}catch (Exception e){
			return "";
		}

	}


}
