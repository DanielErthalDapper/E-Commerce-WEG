package ProjetoBase;

public class Produto_VestuarioTecnico extends Produto
{
    //ATRIBUTOS
    private String tamanho;

    //CONSTRUTOR
    public Produto_VestuarioTecnico(String nome, double preco, double estoque, String tamanho)
    {
        super(nome, preco, estoque);
        this.tamanho = tamanho;

        ListaProdutos.produtos.add(this);
    }


    //GETTER
    public String getTamanho()
    {
        return tamanho;
    }


    //SETTER
    public void setTamanho(String tamanho)
    {
        this.tamanho = tamanho;
    }


    //VALIDAÇÕES
    public static void validarProdutoVestuario(String tamanho)
    {
        if(tamanho.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O PRODUTO DEVE TER UM TAMANHO DEFINIDO");
        }

        if(!tamanho.equals("PP") | tamanho.equals("P") |  tamanho.equals("M") |
                tamanho.equals("G") | tamanho.equals("GG") )
        {
            throw new IllegalArgumentException("ERRO! O TAMANHO DEVE SER PP | P | M | G | GG");
        }
    }
}
