/**
 * Classe representando um imóvel.
 */
public class imovel {
    /** Endereço do imóvel. */
    String endereco;
    /** Área do imóvel em metros quadrados. */
    float area;
    /** Preço do imóvel. */
    float preco;
    /** Número de banheiros do imóvel. */
    int numeroBanheiros;
    /** Número de quartos do imóvel. */
    int numeroQuartos;
    /** Indica se o imóvel está mobilhado. */
    boolean mobilhada;

    /**
     * Construtor da classe Imovel.
     * @param endereco Endereço do imóvel.
     * @param area Área do imóvel em metros quadrados.
     * @param numeroBanheiros Número de banheiros do imóvel.
     * @param numeroQuartos Número de quartos do imóvel.
     * @param mobilhada Indica se o imóvel está mobilhado.
     * @param preco Preço do imóvel.
     */
    public imovel(String endereco, float area, int numeroBanheiros, int numeroQuartos, boolean mobilhada, float preco){
        this.endereco = endereco;
        this.area = area;
        this.preco = preco;
        this.numeroBanheiros = numeroBanheiros;
        this.numeroQuartos = numeroQuartos;
        this.mobilhada = mobilhada;
    }
}