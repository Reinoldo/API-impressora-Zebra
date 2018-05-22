package br.teste;

import br.com.dsg.zpl.elemento.CodigoBarra;
import br.com.dsg.zpl.elemento.Posicao;
import br.com.dsg.zpl.elemento.QRCode;
import br.com.dsg.zpl.elemento.core.*;

public class TesteQRCode {

    public static void main(String[] args) {
        QRCode qr = new QRCode(new Posicao(150,2),2,10, "hahaha");

        String imagem = "resources/zebra/SEDEX10.GRF";

        String nova = ZPLBuilder.novaPagina(UnidadeMedida.MILIMETROS,Densidade.SEIS_PONTOS, 25, 25)
                .registra(qr)
                .escrever();

        System.out.println(nova);

        CodigoBarra bar = new CodigoBarra(new Posicao(5, 10),new Dimensao(5, 150), true,"E-ticket: 1234567890");

        ((Pagina)
                ZPLBuilder.novaPagina(UnidadeMedida.MILIMETROS,Densidade.SEIS_PONTOS, 70, 150)
                .registra(bar)
                .registra(qr)
                ).test();

       // System.out.println(stringBar);




    }
}
