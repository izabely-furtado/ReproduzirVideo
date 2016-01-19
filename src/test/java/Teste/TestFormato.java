package Teste;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cdp.Form;
import cdp.Formato;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IzabelyFurtado
 */
public class TestFormato {
    
    public TestFormato() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void getFormato1(){
        String retorno = "Formato: AVI";
        Formato form = Formato.getFormato(Form.AVI.getValor());
        assertEquals(retorno, form.toString());
    }
    
    @Test
    public void getFormato2(){
        String retorno = "Formato: MP3";
        Formato form = Formato.getFormato(Form.MP3.getValor());
        assertEquals(retorno, form.toString());
    }
    
    @Test
    public void getFormato3(){
        String retorno = "Formato: MP4";
        Formato form = Formato.getFormato(Form.MP4.getValor());
        assertEquals(retorno, form.toString());
    }
    
    /*
    @Test
    public void getFormatoERRO(){
        String retorno = "Formato: MP4";
        Formato form = Formato.getFormato(4);
        assertEquals(retorno, form.toString());
    }
    */
    
    @Test
    public void carregaArquivoLegendaAVI(){
        String retorno = "Carregando Arquivo AVI \n"
                       + "Carregando Legenda";
        Formato form = Formato.getFormato(Form.AVI.getValor());
        assertEquals(retorno, form.carregaArquivoLegenda());
    }
    
    @Test
    public void carregaArquivoLegendaMP3(){
        String retorno = "Carregando Arquivo MP3 \n"
                       + "Carregando Legenda";
        Formato form = Formato.getFormato(Form.MP3.getValor());
        assertEquals(retorno, form.carregaArquivoLegenda());
    }

    @Test
    public void carregaArquivoLegendaMP4(){
        String retorno = "Carregando Arquivo MP4 \n"
                       + "Carregando Legenda";
        Formato form = Formato.getFormato(Form.MP4.getValor());
        assertEquals(retorno, form.carregaArquivoLegenda());
    }

    @Test
    public void reproduzirVideoAVI(){
        String retorno = "Reproduzindo Vídeo no Formato AVI";
        Formato form = Formato.getFormato(Form.AVI.getValor());
        assertEquals(retorno, form.reproduzVideo());
    }
    
    @Test
    public void reproduzirVideoMP3(){
        String retorno = "Reproduzindo Vídeo no Formato MP3";
        Formato form = Formato.getFormato(Form.MP3.getValor());
        assertEquals(retorno, form.reproduzVideo());
    }
    
    @Test
    public void reproduzirVideoMP4(){
        String retorno = "Reproduzindo Vídeo no Formato MP4";
        Formato form = Formato.getFormato(Form.MP4.getValor());
        assertEquals(retorno, form.reproduzVideo());
    }
    
    @Test
    public void finalizaReproducaoAVI(){
        String retorno = "The End"
                       + "Finalizando Reprodução do AVI \n";
        Formato form = Formato.getFormato(Form.AVI.getValor());
        assertEquals(retorno, form.finalizaReproducao());
    }
    
    @Test
    public void finalizaReproducaoMP3(){
        String retorno = "The End"
                       + "Finalizando Reprodução do MP3 \n";
        Formato form = Formato.getFormato(Form.MP3.getValor());
        assertEquals(retorno, form.finalizaReproducao());
    }
    
    @Test
    public void finalizaReproducaoMP4(){
        String retorno = "The End"
                       + "Finalizando Reprodução do MP4 \n";
        Formato form = Formato.getFormato(Form.MP4.getValor());
        assertEquals(retorno, form.finalizaReproducao());
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
