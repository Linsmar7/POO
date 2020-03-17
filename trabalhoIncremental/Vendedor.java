
/**
 * Escreva a descrição da classe Vendedor aqui.
 * 
 * @author (Linsmar da Silva Vital) 
 * @version (v1 16032020)
 */
public class Vendedor
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private Livro livroSendoVendido;
    

    /**
     * COnstrutor para objetos da classe Vendedor
     */
    public Vendedor(String nome, String titulo, String categoria, String anoEscolar, String condicao, double valor)
    {
        this.nome = nome;
        this.livroSendoVendido = new Livro(titulo, categoria, anoEscolar, condicao, valor);
    }
}
