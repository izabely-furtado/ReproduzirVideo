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
public class FormatoMP3 extends Formato{

    public FormatoMP3() {
        super("MP3");
    }

    @Override
    public void carregaArquivoLegenda() {
        System.out.println("Carregando Arquivo MP3");
        System.out.println("Carregando Legenda");
    }

    @Override
    public void reproduzVideo() {
        System.out.println("Reproduzindo Vídeo no Formato MP3");
    }

    @Override
    public void finalizaReproducao() {
        System.out.println("The End");
        System.out.println("Finalizando Reprodução do MP3");
    }
    
}
