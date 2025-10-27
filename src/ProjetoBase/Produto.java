package ProjetoBase;

public abstract class Produto
{
    //ATRIBUTOS
    private String nome;
    private double preco;
    private double estoque;

    //CONSTRUTOR
    public Produto(String nome, double preco, double estoque)
    {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    //GETTER
    public String getNome()
    {
        return nome;
    }
    public double getEstoque()
    {
        return estoque;
    }
    public double getPreco()
    {
        return preco;
    }

    //SETTER
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    public void setEstoque(double estoque)
    {
        this.estoque = estoque;
    }

    //VALIDAÇÕES
    public static void validarNome(String nome)
    {
        if(nome.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O NOME DO PRODUTO NÃO PODE SER VAZIO");
        }
    }

    public static void validarPreco(double preco)
    {
        if(preco == 0)
        {
            throw new IllegalArgumentException("ERRO! O PRODUTO PRECISA TER UM PREÇO!");
        }
    }

    public static void validarEstoque(double estoque)
    {
        if(estoque == 0)
        {
            throw new IllegalArgumentException("ERRO! É NECESSÁRIO QUE TENHA AO MENOS UM ITEM EM ESTOQUE");
        }
    }
}
