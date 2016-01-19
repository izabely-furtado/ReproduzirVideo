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
    public String carregaArquivoLegenda() {
        return "Carregando Arquivo AVI \n"
             + "Carregando Legenda";
    }

    @Override
    public String reproduzVideo() {
        return "Reproduzindo Vídeo no Formato AVI";
    }

    @Override
    public String finalizaReproducao() {
        return "The End"
             + "Finalizando Reprodução do AVI \n";
    }
    
}
