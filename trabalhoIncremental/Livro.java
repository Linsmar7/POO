
/**
 * Escreva a descrição da classe Livro aqui.
 * 
 * @author (Linsmar da Silva Vital) 
 * @version (v1 16032020)
 */
public class Livro
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String condicao;
    private double valor;
    private String anoEscolar; //Ensino Médio, 1° ano, etc...
    private String titulo;
    private String categoria; //Matemática, português, histórias para leitura, etc...
    

    /**
     * COnstrutor para objetos da classe Livro
     */
    public Livro(String titulo, String categoria, String anoEscolar, String condicao, double valor)
    {
        this.titulo = titulo;
        this.categoria = categoria;
        this.anoEscolar = anoEscolar;
        this.condicao = condicao;
        this.valor = valor;
    }

}
