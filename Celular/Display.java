
/**
 * Escreva a descrição da classe Display aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Display
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int dimH;
    private int dimV;
    private String textoInicial;

    /**
     * COnstrutor para objetos da classe Display
     */
    public Display(int dimH, int dimV, String textoInicial)
    {
        // inicializa variáveis de instância
        this.dimH = dimH;
        this.dimV = dimV;
        this.textoInicial = textoInicial;
    }

    public int getDimH(){
        return this.dimH;
    }
    public int getDimV(){
        return this.dimV;
    }
    public String getTextoInicial(){
        return this.textoInicial;
    }
    
    public void setDimH(int n){
        this.dimH = n;
    }
    public void setDimV(int n){
        this.dimV = n;
    }
    public void setTextoInicial(String n){
        this.textoInicial = n;
    }
}
