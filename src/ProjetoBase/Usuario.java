package ProjetoBase;

public abstract class Usuario
{
    //ATRIBUTOS
    private String nome;
    private String senha;
    private String email;
    private String cpf;

    //CONSTRUTOR DE USUÁRIO
    public Usuario(String nome, String senha, String email, String cpf)
    {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;

        ListaUsuarios.usuarios.add(this);
    }
    //GETTERS DE NOME/LOGIN/SENHA/EMAIL/CPF
    public String getNome()
    {
        return nome;
    }
    public String getSenha()
    {
        return senha;
    }
    public String getEmail()
    {
        return email;
    }
    public String getCpf()
    {
        return cpf;
    }
    //SETTERS DE NOME/LOGIN/SENHA/EMAIL/CPF
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    //VALIDAÇÕES
    public static void validacaoDeNome(String nome)
    {
        if(nome.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O NOME NÃO PODE SER VAZIO");
        }

        boolean contemEspecial = false;
        for(String caracterEspecial : Ferramentas.listaEspeciais)
        {
            if(nome.contains(caracterEspecial))
            {
                contemEspecial = true;
            }
        }
        if(contemEspecial)
        {
            throw new IllegalArgumentException("ERRO! A NOME NÃO DEVE CONTER CARACTERES ESPECIAIS");
        }
    }

    public static void validacaoDeSenha(String senha, String senhaConfirmacao)
    {
        if(senha.isBlank())
        {
            throw new IllegalArgumentException("ERRO! A SENHA NÃO PODE SER VAZIA");
        }
        if(!senha.equals(senhaConfirmacao))
        {
            throw new IllegalArgumentException("ERRO! AS SENHAS PRECISÃO SER IGUAIS");
        }
        if(senha.length() < 10)
        {
            throw new IllegalArgumentException("ERRO! A SENHA NÃO PODE TER MENOS DE 10 CARACTERES");
        }
        boolean contemEspecial = false;
        for(String caracterEspecial : Ferramentas.listaEspeciais)
        {
            if(senha.contains(caracterEspecial))
            {
                contemEspecial = true;
            }
        }
        if(!contemEspecial)
        {
            throw new IllegalArgumentException("ERRO! A SENHA DEVE CONTER CARACTERES ESPECIAIS");
        }

        boolean contemMaiuscula = false;
        for(String letraMaiuscula : Ferramentas.listaMaiusculos)
        {
            if(senha.contains(letraMaiuscula))
            {
                contemMaiuscula = true;
            }
        }
        if(!contemMaiuscula)
        {
            throw new IllegalArgumentException("ERRO! A SENHA DEVE CONTER LETRAS MAIÚSCULAS");
        }
        boolean contemNumero = false;
        for(String numero : Ferramentas.listaNumeros)
        {
            if(senha.contains(numero));
            contemNumero = true;
        }
        if(!contemNumero)
        {
            throw new IllegalArgumentException("ERRO! A SENHA DEVE CONTER NÚMERO");
        }
    }

    public static void validacaoDeCPF(String cpf)
    {
        if(cpf.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O CPF NÃO PODE SER VAZIO");
        }

        if(cpf.length() != 11)
        {
            throw new IllegalArgumentException("ERRO! O CPF PRECISA TER 11 DIGITOS");
        }

        boolean contemMaiuscula = false;
        for(String letraMaiuscula : Ferramentas.listaMaiusculos)
        {
            if(cpf.contains(letraMaiuscula))
            {
                contemMaiuscula = true;
            }
        }
        if(contemMaiuscula)
        {
            throw new IllegalArgumentException("ERRO! O CPF NÃO PODE CONTER LETRAS");
        }

        boolean contemCaracter = false;
        for(String caracterEspecial : Ferramentas.listaEspeciais)
        {
            if(cpf.contains(caracterEspecial))
            {
                contemCaracter = true;
            }
        }
        if(contemCaracter)
        {
            throw new IllegalArgumentException("ERRO! O CPF NÃO PODE CONTER CARACTER ESPECIAL");
        }
    }
    public static void validacaoDeEmail(String email)
    {
        if(email.isBlank())
        {
            throw new IllegalArgumentException("ERRO! O EMAIL NÃO PODE SER VAZIO!");
        }
        if(!email.contains("@"))
        {
            throw new IllegalArgumentException("ERRO! O EMAIL PRECISA CONTER O CARACTER @");
        }
        if(!email.contains("gmail.com"))
        {
            throw new IllegalArgumentException("ERRO! O EMAIL PRECISA CONTER O 'gmail.com'");
        }
    }
}
