package Menus;

import ProjetoBase.Ferramentas;
import ProjetoBase.Usuario_Cliente;

public class MenuSetCliente
{
    public static String menuSetEndereco()
    {
        boolean verifica = false;
        String endereco = " ";

        while(!verifica)
        {
            System.out.println("Digite seu endereço: ");
            endereco = Ferramentas.lString();

            try
            {
                Usuario_Cliente.validarEndereco(endereco);
                verifica = true;
            }
            catch(IllegalArgumentException e)
            {
                Ferramentas.mensagemErro(e.getMessage());
            }

        }

        return endereco;
    }
}
