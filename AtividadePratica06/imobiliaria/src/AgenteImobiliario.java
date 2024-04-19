/**
 * Classe representando um agente imobiliário.
 */
import java.util.ArrayList;
public class AgenteImobiliario {
    /** Nome do agente imobiliário. */
    String nome;
    /** CPF do agente imobiliário. */
    String CPF;
    /** ID do agente imobiliário. */
    int ID;
    /** Lista de imóveis no portfólio do agente imobiliário. */
    ArrayList<imovel> portfolio;

    /**
     * Construtor da classe AgenteImobiliario.
     * @param nome Nome do agente imobiliário.
     * @param CPF CPF do agente imobiliário.
     * @param ID ID do agente imobiliário.
     */
    public AgenteImobiliario(String nome, String CPF, int ID) {
        this.nome = nome;
        this.CPF = CPF;
        this.ID = ID;
        this.portfolio = new ArrayList<>();
    }
}