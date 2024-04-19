/**
 * Classe representando uma conta bancária.
 * 
 * @author Alexandre Reis Francisco Júnior e uma ajudinha do Chat GPT
 */
public class ContaBancaria {
    /** Número da conta. */
    private int numero;
    /** Nome do titular da conta. */
    private String nome;
    /** Saldo da conta. */
    private float saldo;

    /**
     * Construtor da classe ContaBancaria.
     * @param umNumero Número da conta.
     * @param umNome Nome do titular da conta.
     */
    public ContaBancaria(int umNumero, String umNome){
        this.numero = umNumero;
        this.nome = umNome;
        saldo = 0.0f;
    }

    /**
     * Obtém o número da conta.
     * @return O número da conta.
     */
    public int getNumero(){
        return numero;
    }

    /**
     * Obtém o nome do titular da conta.
     * @return O nome do titular da conta.
     */
    public String getNome(){
        return nome;
    }

    /**
     * Obtém o saldo da conta.
     * @return O saldo da conta.
     */
    public float getSaldo(){
        return saldo;
    }

    /**
     * Adiciona R$50 ao saldo da conta.
     */
    public void depositar50(){
        saldo = saldo + 50;
    }

    /**
     * Retira R$50 do saldo da conta.
     */
    public void sacar50(){
        saldo = saldo - 50;
    }
}