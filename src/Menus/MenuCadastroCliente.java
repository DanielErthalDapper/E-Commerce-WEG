package Menus;

import ProjetoBase.Usuario_Adm;
import ProjetoBase.Usuario_Cliente;

public class MenuCadastroCliente
{
    public static void cadastrar()
    {
        boolean cadastroRealizado = false;

        while(!cadastroRealizado)
        {
            try
            {
                System.out.println("|==============================|");
                System.out.println("|==  CADASTRAR NOVO CLIENTE  ==|");
                System.out.println("|==============================|");

                String nome = MenuSetUsuario.menuSetNome();

                String cpf = MenuSetUsuario.menuSetCPF();

                String email = MenuSetUsuario.menuSetEmail();

                String senha = MenuSetUsuario.menuSetSenha();

                String endereco = MenuSetCliente.menuSetEndereco();

                Usuario_Cliente cliente = new Usuario_Cliente(nome, senha, email, cpf, endereco);

                cadastroRealizado = true;

            } catch (IllegalArgumentException e) {
                System.out.println("ERRO TENTE NOVAMENTE MAIS TARDE!");
            }
        }
    }
}
