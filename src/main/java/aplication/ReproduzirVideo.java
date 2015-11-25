/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplication;

import cdp.Video;
import java.util.Scanner;

/**
 *
 * @author IzabelyFurtado
 */
public class ReproduzirVideo {
    
    
    
    public static void reproduzFormato(){
        ReproduzirVideo.leEscolhaFormato();
        System.out.println("Deseja reproduzir em outro formato(4) ou sair(5)?");
        Scanner le = new Scanner(System.in);
        int escolha = le.nextInt();
        while(escolha == 4){
            ReproduzirVideo.leEscolhaFormato();
            System.out.println("\n Deseja reproduzir em outro formato(4) ou sair(5)?");
            le = new Scanner(System.in);
            escolha = le.nextInt();
        }
        System.out.println("Vá \n Pois estragar a propria vida é um direito inalienável - Amélie Poulain");
    }
    
    public static void leEscolhaFormato(){
        System.out.println("Escolha o formato do vídeo:");
        System.out.println("1 - AVI");
        System.out.println("2 - MP3");
        System.out.println("3 - MP4");
        Scanner le = new Scanner(System.in);
        int formatoLido = le.nextInt();
        Video v = new Video("O Fabuloso Destino de Amélie Poulain", 122, "HD", formatoLido);
        System.out.println(v);
        v.executa();
    }
        
}
