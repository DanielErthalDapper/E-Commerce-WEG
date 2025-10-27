package Menus;

import ProjetoBase.Ferramentas;
import ProjetoBase.ListaUsuarios;
import ProjetoBase.Usuario;
import ProjetoBase.Usuario_Adm;

public class MenuLogin
{
    public static void logarNoSistema()
    {
        boolean administrador = false;
        boolean senhaEsp = false;
        boolean loginRealizado = false;

        while(!loginRealizado)
        {
        System.out.println("|==============================|");
        System.out.println("|==========  LOG IN  ==========|");
        System.out.println("|==============================|");
        System.out.println(" ");
        System.out.println("|  1 - Administrador           |");
        System.out.println("|  2 - Cliente                 |");
        System.out.println("|  3 - Retornar                |");
        System.out.println("|  Escolha: ");

            try {
                int opcaoLogin = Ferramentas.lInteiro();

                switch (opcaoLogin) {
                    case 1 -> administrador = true;
                    case 3 -> MenuInicial.inicioDoSistema();
                }

                System.out.println("Digite seu CPF: ");
                String cpfLogin = Ferramentas.lString();

                for (Usuario usuario : ListaUsuarios.usuarios) {
                    if (usuario.getCpf().equals(cpfLogin))
                    {
                        System.out.println("Digite sua senha: ");
                        String senhaLogin = Ferramentas.lString();

                        if (usuario.getSenha().equals(senhaLogin))
                        {
                            if (administrador)
                            {
                                while (!senhaEsp)
                                {
                                    System.out.println("Digite a senha especial: ");
                                    String senhaEspecial = Ferramentas.lString();

                                    try {
                                        Usuario_Adm.validarSenhaEspecial(senhaEspecial);
                                        senhaEsp = true;
                                    } catch (IllegalArgumentException e) {
                                        Ferramentas.mensagemErro(e.getMessage());
                                    }

                                    if (senhaEsp)
                                    {
                                        MenuAdministrador.opcoesAdministrador();
                                    }
                                }
                            } else
                            {
                                MenuCliente.opcoesCliente();
                            }
                        }
                    }
                    break;
                }
            } catch (IllegalArgumentException e)
            {
                Ferramentas.mensagemErro(e.getMessage());
            }
        }
    }
}
