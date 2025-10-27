package Menus;

import ProjetoBase.Ferramentas;
import ProjetoBase.Usuario;
import ProjetoBase.Usuario_Cliente;

public class MenuCadastro
{
    public static void cadastrar()
    {
        boolean cadastroRealizado = false;


            try
            {
                System.out.println("|==============================|");
                System.out.println("|==  CADASTRAR NOVO USUÁRIO  ==|");
                System.out.println("|==============================|");

                MenuSetUsuario.menuSetNome();

                MenuSetUsuario.menuSetCPF();

                MenuSetUsuario.menuSetEmail();

                MenuSetUsuario.menuSetSenha();

            } catch(IllegalArgumentException e)
            {
                System.out.println("ERRO TENTE NOVAMENTE MAIS TARDE!");
            }

    }
}
