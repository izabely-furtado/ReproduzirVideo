/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplication;

import cdp.Video;

/**
 *
 * @author IzabelyFurtado
 */
public class app {
    public static void main(String []args){
        Video v = new Video("xxx", 1234, "UltraHD", 1);
        System.out.println(v);
        v.executa();
    }
}