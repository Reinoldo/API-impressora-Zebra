package br.teste;

import br.com.dsg.zpl.elemento.CodigoBarra;
import br.com.dsg.zpl.elemento.Posicao;
import br.com.dsg.zpl.elemento.QRCode;
import br.com.dsg.zpl.elemento.Imagem;
import br.com.dsg.zpl.elemento.core.*;

import java.io.IOException;

public class TesteQRCode {

    public static void main(String[] args) throws IOException {
        QRCode qr = new QRCode(new Posicao(150,2),2,10, "hahaha");
        TesteQRCode teste = new TesteQRCode();

      //  teste.buscaArquivo();


        //Imagem img = new Imagem(new Posicao(300,300));




        String nova = ZPLBuilder.novaPagina(UnidadeMedida.MILIMETROS,Densidade.SEIS_PONTOS, 25, 25)
                .registra(qr)
                .escrever();

        System.out.println(nova);

        CodigoBarra bar = new CodigoBarra(new Posicao(5, 10),new Dimensao(5, 150), true,"E-ticket: 1234567890");

        ((Pagina)
                ZPLBuilder.novaPagina(UnidadeMedida.MILIMETROS,Densidade.SEIS_PONTOS, 70, 150)
                .registra(bar)
                .registra(qr)
               // .registra(img)
                ).test();

       // System.out.println(stringBar);

    }

//    public String buscaArquivo() throws IOException {
//
//        Imagem img = new Imagem(new Posicao(300,300));
//
//        String imagem = img.leArquivo();
//
//        return imagem;
//    }

}
