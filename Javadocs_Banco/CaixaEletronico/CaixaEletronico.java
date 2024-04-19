/**
 * Classe principal que simula um caixa eletrônico.
 * 
 * @author Alexandre Reis Francisco Júnior e uma ajudinha Chat GPT
 */
public class CaixaEletronico {
    /**
     * Método principal que inicia a simulação do caixa eletrônico.
     * @param args Os argumentos de linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args){
        System.out.println("\nProtótipo de Caixa Eletrônico");
        ContaBancaria minhaConta = new ContaBancaria(1357, "Alexandre");
        System.out.println("\n" + minhaConta.getNome() + ", sua conta criada com sucesso!");
        System.out.println("\nNúmero da Conta: " + minhaConta.getNumero());
        System.out.printf("\nSaldo: R$ %.2f%n%n", minhaConta.getSaldo());
        System.out.println("Depositando dinheiro na conta...");
        minhaConta.depositar50();
        System.out.printf("Saldo: R$ %.2f%n%n", minhaConta.getSaldo());
    }
}