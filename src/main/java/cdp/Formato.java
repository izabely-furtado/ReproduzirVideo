
package cdp;

/**
 *
 * @author IzabelyFurtado
 */
public abstract class Formato {
    protected String nome;
    
    Formato(String nome){
        carregaArquivoLegenda();
        reproduzVideo();
        finalizaReproducao();
    }

    public abstract void carregaArquivoLegenda();
    
    public abstract void reproduzVideo();

    public abstract void finalizaReproducao();
    
    @Override
    public String toString(){
        return "Formato: " + this.nome;
    }
    
    public static Formato getFormato(int formato){
        if (formato == Form.AVI.getValor()){
            return new FormatoAVI();
        }
        else if (formato == Form.MP3.getValor()){
            return new FormatoMP3();
        }
        else if (formato == Form.MP4.getValor()){
            return new FormatoMP4();
        }
        else{
            throw new  RuntimeException("“A vida é um grande e completo texto, "
                            + "que precisa de muitas vírgulas para ser escrito, "
                            + "ainda que essas vírgulas assumam em alguns momentos formatos de lágrimas.” \n"
                            + "―Augusto Cury");
        }
    }
}
