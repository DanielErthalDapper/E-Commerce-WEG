package Menus;

import ProjetoBase.Ferramentas;
import ProjetoBase.Usuario_Cliente;

public class MenuSetUsuario
{
    public static String menuSetNome()
    {
        boolean verifica = false;

        while(!verifica)
        {
            System.out.println("Digite seu nome: ");
            String nome = Ferramentas.lString();

            try
            {
                Usuario_Cliente.validacaoDeNome(nome);
                verifica = true;
            }
            catch(IllegalArgumentException e)
            {
                Ferramentas.mensagemErro(e.getMessage());
            }
        }
        return " ";
    }

    public static String menuSetCPF()
    {
        boolean verifica = false;

        while(!verifica)
        {
            System.out.println("Digite seu CPF: ");
            String cpf = Ferramentas.lString();

            try
            {
                Usuario_Cliente.validacaoDeCPF(cpf);
                verifica = true;
            }
            catch(IllegalArgumentException e)
            {
                Ferramentas.mensagemErro(e.getMessage());
            }
        }
        return " ";
    }

    public static String menuSetEmail()
    {
        boolean verifica = false;

        while(!verifica)
        {
            System.out.println("Digite seu email: ");
            String email = Ferramentas.lString();

            try
            {
                Usuario_Cliente.validacaoDeEmail(email);
                verifica = true;
            }
            catch(IllegalArgumentException e)
            {
                Ferramentas.mensagemErro(e.getMessage());
            }
        }
        return " ";
    }

    public static String menuSetSenha()
    {
        boolean verifica = false;

        while(!verifica)
        {
            System.out.println("Crie uma senha: ");
            String senha = Ferramentas.lString();
            System.out.println("Confirme sua senha: ");
            String senhaConfirmacao = Ferramentas.lString();

            try
            {
                Usuario_Cliente.validacaoDeSenha(senha, senhaConfirmacao);
                verifica = true;
            }
            catch(IllegalArgumentException e)
            {
                Ferramentas.mensagemErro(e.getMessage());
            }
        }
        return " ";
    }
}
