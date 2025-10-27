package ProjetoBase;

import java.util.List;

public class Pedidos
{
    //ATRIBUTOS
    private String item;
    private double valorTotal;
    private String endereco;
    private boolean status = false; //SE O STATUS ESTIVER FALSO É PQ O PEDIDO AINDA NÃO FOI PAGO;
    private List<Produto> produtos;

    //CONSTRUTOR
    public Pedidos(String item, double valorTotal, String endereco, boolean status, List<Produto> produtos)
    {
        this.item = item;
        this.valorTotal = valorTotal;
        this.endereco = endereco;
        this.status = status;
    }
    public Pedidos(List<Produto> produto)
    {

    }

    //GETTERS
    public void setItem(String item)
    {
        this.item = item;
    }
    public void setValorTotal(double valorTotal)
    {
        this.valorTotal = valorTotal;
    }
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
    public void setStatus(boolean status)
    {
        this.status = status;
    }

    //SETTERS
    public String getItem()
    {
        return item;
    }
    public String getEndereco()
    {
        return endereco;
    }
    public double getValorTotal()
    {
        return valorTotal;
    }
    public boolean isStatus()
    {
        return status;
    }

    public void exibirNotaFiscal()
    {
        System.out.println("|==============================|");
        System.out.println("Item: "+item);
        System.out.println("Valor Total: "+valorTotal);
        System.out.println("Endereço: "+endereco);
        System.out.println("Status: "+status);
        System.out.println("|==============================|");

    }
}
