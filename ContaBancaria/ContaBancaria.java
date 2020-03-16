
/**
 * Escreva a descrição da classe ContaBancaria aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ContaBancaria
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private int agencia;
    private int numero;
    private double saldo;
    private boolean especial;

    /**
     * COnstrutor para objetos da classe ContaBancaria
     */
    public ContaBancaria(String nome, int agencia, int numero)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
        this.especial = false;
    }
    public ContaBancaria(String nome, int agencia, int numero, double saldo)
    {
        // inicializa variáveis de instância
        this(nome, agencia, numero);
        this.saldo = saldo;
        this.especial = true;
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public void extrato()
    {
        // ponha seu código aqui
        System.out.println("Nome: "+this.nome+"\nAgência: "+this.agencia+"\nNúmero da conta: "+this.numero+"\nSaldo: "+this.saldo);
        if (this.especial) System.out.println("Saldo + Limite: "+(this.saldo+500));
    }
    public void deposito(double n){
        this.saldo += n;
    }
    public boolean saque(double n){
        if (this.especial){
            if ((this.saldo - n) < -500)return false;
        }
        else {
            if ((this.saldo -n) < 0) return false;
        }
        this.saldo -= n;
        return true;
    }
    public boolean saque() {
        return saque(50);
    }
            
}
