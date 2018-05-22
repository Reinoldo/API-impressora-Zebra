package br.com.dsg.zpl.elemento;

import br.com.dsg.zpl.elemento.core.ComandoGeral;
import br.com.dsg.zpl.elemento.core.Dimensao;
import br.com.dsg.zpl.elemento.core.GerenciadorElemento;
import br.com.dsg.zpl.elemento.core.Rotacao;

public class QRCode extends ComandoSimples{

    private ComandoGeral QRCode = new ComandoGeral("^BQ");

    private Rotacao rotacao = Rotacao.N;

    private int modelo = 2;
    private int magnificacao;
    private String valor = null;
    public QRCode (Posicao posicao, int modelo, int magnificacao, String valor){
        super(posicao);

        this.modelo = modelo;
        this.magnificacao = magnificacao;
        this.valor = valor;

    }


    @Override
    protected void montaCampo(GerenciadorElemento gerenciador) {


        QRCode.comValor(this.rotacao.name());
        QRCode.comValor(this.modelo);
        QRCode.comValor(this.magnificacao);

        gerenciador.registra(QRCode);
        gerenciador.registra( new Texto("MM,A" + this.valor));
    }
}
