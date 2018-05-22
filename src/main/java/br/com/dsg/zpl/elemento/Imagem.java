package br.com.dsg.zpl.elemento;

import br.com.dsg.zpl.elemento.core.ComandoGeral;
import br.com.dsg.zpl.elemento.core.GerenciadorElemento;

public class Imagem extends ComandoSimples {

    private ComandoGeral comando = new ComandoGeral("^GF");


    public Imagem(Posicao posicao){
        super(posicao);
    }


    @Override
    protected void montaCampo(GerenciadorElemento gerenciador) {

    }
}
