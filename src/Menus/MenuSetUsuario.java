package Menus;

import ProjetoBase.Ferramentas;
import ProjetoBase.Usuario_Cliente;

public class MenuSetUsuario
{
    public static String menuSetNome()
    {
        boolean verifica = false;
        String nome = " ";

        while(!verifica)
        {
            System.out.println("Digite seu nome: ");
            nome = Ferramentas.lString();

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
        return nome;
    }

    public static String menuSetCPF()
    {
        boolean verifica = false;
        String cpf = " ";

        while(!verifica)
        {
            System.out.println("Digite seu CPF: ");
            cpf = Ferramentas.lString();

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
        return cpf;
    }

    public static String menuSetEmail()
    {
        boolean verifica = false;
        String email = " ";

        while(!verifica)
        {
            System.out.println("Digite seu email: ");
            email = Ferramentas.lString();

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
        return email;
    }

    public static String menuSetSenha()
    {
        boolean verifica = false;
        String senha = " ";
        String senhaConfirmacao = " ";

        while(!verifica)
        {
            System.out.println("Crie uma senha: ");
            senha = Ferramentas.lString();
            System.out.println("Confirme sua senha: ");
            senhaConfirmacao = Ferramentas.lString();

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
        return senha;
    }
}
