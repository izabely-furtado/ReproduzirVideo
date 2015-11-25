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
public class Video {
    
    String titulo;
    int minutos;
    String qualidade;
    int formato;
    
    public Video(String titulo, int minutos, String qualidade, int formato){
        this.titulo = titulo;
        this.minutos = minutos;
        this.qualidade = qualidade;
        this.formato = formato;
    }
    
    public void executa(){
        Formato.getFormato(this.formato);
    }
    
    @Override
    public String toString(){
        return "Vídeo " + this.titulo 
             + " com " + this.minutos + " minutos"
             + " e qualidade " + this.qualidade; 
    }
    
}
