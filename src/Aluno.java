public class Aluno {
    private String nome;
    private String matricula;
    private String curso ;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome(){ //get adicionado
        return nome;
    }

    public void exibirInfo(){
        System.out.println("Aluno: " + nome + " | Mátricula: " + matricula + " | Curso: " + (curso !=null ? curso : "-"));
    }
}