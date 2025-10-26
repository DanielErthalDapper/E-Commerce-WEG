package ProjetoBase;

import java.util.ArrayList;
import java.util.List;

public class Usuario_Adm extends Usuario
{
    /*
● Gerar e gerenciar cupons de desconto.
● Ajustar o estoque de qualquer produto.
● Visualizar o histórico de pedidos de todos os clientes.*/

    //ATRIBUTOS
    private String senhaEspecial;

    //CONSTRUTOR
    public Usuario_Adm(String nome, String senha, String email, String cpf, String senhaEspecial)
    {
        super(nome, senha, email, cpf);
        this.senhaEspecial = senhaEspecial;
    }

    //GETTER
    public String getSenhaEspecial()
    {
        return senhaEspecial;
    }

    //SETTER
    public void setSenhaEspecial(String senhaEspecial)
    {
        this.senhaEspecial = senhaEspecial;
    }
    //VALIDAÇÃO
    public static void validarSenhaEspecial(String senhaEspecial)
    {
        if(!senhaEspecial.equals("Admin"))
        {
            throw new IllegalArgumentException("ERRO! A SENHA ESPECIAL DEVE ESTAR CORRETA!");
        }

        if(senhaEspecial.isBlank())
        {
            throw new IllegalArgumentException("ERRO! A SENHA ESPECIAL NÃO PODE SER VAZIA!");
        }
    }
}
