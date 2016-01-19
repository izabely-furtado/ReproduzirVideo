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
public class FormatoMP4 extends Formato{
    
    FormatoMP4(){
        super("MP4");
    }

    @Override
    public String carregaArquivoLegenda() {
        return "Carregando Arquivo MP4 \n"
             + "Carregando Legenda";
    }

    @Override
    public String reproduzVideo() {
        return "Reproduzindo Vídeo no Formato MP4";
    }

    @Override
    public String finalizaReproducao() {
        return "The End"
             + "Finalizando Reprodução do MP4 \n";
    }
    
}
