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
public enum Form {
    AVI(1), MP3(2), MP4(3);
    
    public int valorFormato;
    
    Form(int valor){
        this.valorFormato = valor;
    }
    
    public int getValor(){
        return this.valorFormato;
    }
    
}
