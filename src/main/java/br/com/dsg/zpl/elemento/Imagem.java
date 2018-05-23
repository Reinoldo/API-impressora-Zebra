package br.com.dsg.zpl.elemento;

import br.com.dsg.zpl.elemento.core.ComandoGeral;
import br.com.dsg.zpl.elemento.core.Elemento;
import br.com.dsg.zpl.elemento.core.GerenciadorElemento;

import java.io.*;

public class Imagem extends ComandoSimples {

    private Image imagem = null;
    Posicao posicao = null;

    public Imagem(Posicao posicao, Image imagem ){
        super(null);
        this.posicao = posicao;
        this.imagem = imagem;
    }


    @Override
    protected void montaCampo(GerenciadorElemento gerenciador){
       // String teste = leArquivo();
       // gerenciador.registra();

        gerenciador.registra((Elemento) imagem);

        gerenciador.registra(posicao);

        gerenciador.registra(new ComandoGeral("^XG")
                .comValor("R:"+this.imagem.getNomeImagem())
                .comValor(1)
                .comValor(1)
        );

    }
}
