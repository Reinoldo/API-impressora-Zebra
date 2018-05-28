package br.com.dsg.zpl.elemento;

import br.com.dsg.zpl.elemento.core.ComandoGeral;
import br.com.dsg.zpl.elemento.core.Elemento;
import br.com.dsg.zpl.elemento.core.GerenciadorElemento;

import java.io.*;

public class Imagem extends ComandoSimples {

    private Image imagem = null;
    Posicao posicao = null;
    int magnitudeX;
    int magnitudeY;

    public Imagem(Posicao posicao, Image imagem,int magnitudeX, int magnitudeY  ){
        super(null);
        this.posicao = posicao;
        this.imagem = imagem;
        this.magnitudeX = magnitudeX;
        this.magnitudeY = magnitudeY;
    }


    @Override
    protected void montaCampo(GerenciadorElemento gerenciador){


        gerenciador.registra((Elemento) imagem);

        gerenciador.registra(posicao);

        gerenciador.registra(new ComandoGeral("^XG")
                .comValor("R:"+this.imagem.getNomeImagem())
                .comValor(this.magnitudeX)
                .comValor(this.magnitudeY)
        );

    }
}
