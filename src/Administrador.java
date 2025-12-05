public class Administrador extends Usuario {

    public Administrador(String nome, String login, String senha){
        super(nome, login, senha);
    }

    @Override
    public boolean autenticar(String login, String senha){
        return this.login.equals(login) && this.senha.equals(senha);
    }
}
