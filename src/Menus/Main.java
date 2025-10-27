package Menus;

import ProjetoBase.Produto_Eletronico;
import ProjetoBase.Produto_VestuarioTecnico;
import ProjetoBase.Usuario_Adm;

public class Main
{
    public static void main(String[] args)
    {
        Usuario_Adm admin = new Usuario_Adm("Adm", "123", "adm@gmail.com", "12345678912", "Admin");
        Produto_Eletronico eletronico = new Produto_Eletronico("PC", 20, 50, 1);
        Produto_Eletronico eletronico1 = new Produto_Eletronico("Teclado", 30, 100, 2);
        Produto_VestuarioTecnico vestuario = new Produto_VestuarioTecnico(" Casaco", 50, 10, "M");
        Produto_VestuarioTecnico vestuarioTecnico = new Produto_VestuarioTecnico("Vestido", 20, 15, "P");

        System.out.println("|==============================|");
        System.out.println("|=====  E - COMMERCE WEG  =====|");
        System.out.println("|==============================|");

        MenuInicial.inicioDoSistema();
    }
}
