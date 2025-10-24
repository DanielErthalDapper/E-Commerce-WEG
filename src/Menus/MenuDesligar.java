package Menus;

import ProjetoBase.Ferramentas;

public class MenuDesligar
{
    public static void desligando()
    {
        System.out.println("|------------------------------|");
        System.out.println("|  DESLIGANDO . . .            |");
        System.out.println("|------------------------------|");

        Ferramentas.Delay(1500);

        System.exit(0);
    }
}
