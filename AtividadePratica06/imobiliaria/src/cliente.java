/**
 * Classe representando um cliente.
 */
import java.util.ArrayList;
public class cliente {
    /** Nome do cliente. */
    String nome;
    /** CPF do cliente. */
    String CPF;
    /** RG do cliente. */
    String RG;
    /** Idade do cliente. */
    int idade;
    /** Lista de imóveis de interesse do cliente. */
    ArrayList<imovel> interesses;

    /**
     * Construtor da classe Cliente.
     * @param nome Nome do cliente.
     * @param CPF CPF do cliente.
     * @param RG RG do cliente.
     * @param idade Idade do cliente.
     */
    public cliente(String nome, String CPF, String RG, int idade ){
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.idade = idade;
        this.interesses = new ArrayList<>();
    }
}
