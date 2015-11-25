/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cdp;

/**
 *
 * @author IzabelyFurtado
 */
public class FormatoAVI extends Formato{
    
    FormatoAVI(){
        super("AVI");
    }

    @Override
    public void carregaArquivoLegenda() {
        System.out.println("Carregando Arquivo AVI");
        System.out.println("Carregando Legenda");
    }

    @Override
    public void reproduzVideo() {
        System.out.println("Reproduzindo Vídeo no Formato AVI");
    }

    @Override
    public void finalizaReproducao() {
        System.out.println("The End");
        System.out.println("Finalizando Reprodução do AVI");
        System.out.println();
    }
    
}
