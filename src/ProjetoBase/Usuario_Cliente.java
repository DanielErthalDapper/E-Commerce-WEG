package ProjetoBase;

import java.util.ArrayList;
import java.util.List;

public class Usuario_Cliente extends Usuario
{
    //ATRIBUTOS
    private static List<Pedidos> historicoDeCompras;
    private String endereco;

    //CONSTRUTOR
    public Usuario_Cliente(String nome, String senha, String email, String cpf, List historicoDeCompras, String endereco)
    {
        super(nome, senha, email, cpf);
        this.historicoDeCompras = historicoDeCompras;
        this.endereco = endereco;
    }

    //MEÉTODOS DE REALIZAR COMPRAS E CONSULTAR HISTÓRICO
    public static void realizarCompra(Produto produto)
    {
        Pedidos novoPedido = new Pedidos(List.of(produto));

        historicoDeCompras.add(novoPedido);

        System.out.println("Compra realizada! Total: R$"+novoPedido.getValorTotal());
    }

    public static void exibirHistoricoDeCompras()
    {
        if(historicoDeCompras.isEmpty())
        {
            System.out.println("NENHUMA COMPRA FOI REGISTRADA AINDA!");
        }
        else
        {
            for(Pedidos pedidos : historicoDeCompras)
            {
                System.out.println(pedidos);
            }
        }
    }

    //GETTER
    public List getHistoricoDeCompras()
    {
        return historicoDeCompras;
    }
    public String getEndereco()
    {
        return endereco;
    }

    //SETTER
    public void setHistoricoDeCompras(List COMPRAS)
    {
        this.historicoDeCompras = historicoDeCompras;
    }
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    //VALIDAÇÃO

    public static void validarEndereco(String endereco)
    {
        if(endereco.isBlank())
        {
            endereco.equals(" ");
        }
    }
}