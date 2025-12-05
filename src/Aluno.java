public class Aluno extends Usuario {

    private String nome;
    private String matricula;
    private String curso ;

    public Aluno(String nome, String matricula, String curso) {
        super(nome, login, senha);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome(){ //get adicionado
        return nome;
    }

    public void exibirInfo(){
        System.out.println("Aluno: " + nome + " | Mátricula: " + matricula + " | Curso: " + (curso !=null ? curso : "-"));
    }

    @Override
    public boolean autenticar(String login, String senha){
        return this.login.equals(login) && this.senha.equals(senha);
    }
}