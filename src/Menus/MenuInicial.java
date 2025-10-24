package Menus;

import ProjetoBase.Ferramentas;

public class MenuInicial
{
    public static void inicioDoSistema()
    {
        boolean continuar = true;
        boolean checkOpcaoInicio;
        int opcaoInicio = 0;

        while(continuar)
        {
            do
            {
                System.out.println("|=======  MENU INICIAL  =======|");
                System.out.println("| 1 - Realizar o Cadastro      |");
                System.out.println("| 2 - Log In                   |");
                System.out.println("| 3 - Sair do Sistema          |");
                System.out.println("|==============================|");
                System.out.println("| Escolha: ");

                try
                {
                    opcaoInicio = Ferramentas.lInteiro();
                    checkOpcaoInicio = true;
                }
                catch(IllegalArgumentException e)
                {
                    System.out.println("ERRO! "+e.getMessage());
                    checkOpcaoInicio = false;
                }
            }
            while (!checkOpcaoInicio);

            switch (opcaoInicio)
            {
                case 1:
                {
                    MenuCadastro.cadastrar();
                    break;
                }
                case 2:
                {
                    MenuLogin.logarNoSistema();
                    break;
                }
                case 3:
                {
                    MenuDesligar.desligando();
                    break;
                }
            }
        }

    }
}
