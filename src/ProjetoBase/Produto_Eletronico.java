package ProjetoBase;

public class Produto_Eletronico extends Produto
{
    //ATRIBUTOS
    private double garantiaEmMeses;

    //CONSTRUTOR
    public Produto_Eletronico(String nome, double preco, double estoque, double garantiaEmMeses)
    {
        super(nome, preco, estoque);
        this.garantiaEmMeses = garantiaEmMeses;

        ListaProdutos.produtos.add(this);
    }

    //GETTER
    public double getGarantiaEmMeses()
    {
        return garantiaEmMeses;
    }

    //SETTER
    public void setGarantiaEmMeses(double garantiaEmMeses)
    {
        this.garantiaEmMeses = garantiaEmMeses;
    }

    //VALIDAÇÕES
    public static void validarProdutoEletronico(double garantiaEmMeses)
    {
        if(garantiaEmMeses < 1)
        {
            throw new IllegalArgumentException("ERRO! É NECESSÁRIO AO MENOS UM MÊS DE GARANTIA");
        }
    }
}
