public class Avaliacao {

    private double nota;
    private String descricao;

    public Avaliacao(String descricao){
        this.descricao = descricao;
    }

    public double getNota() {
        return nota;
    }

    public String getDescricao(){
        return descricao;
    }

    public void atribuirNota(double valor){
        if (valor < 0 || valor > 10){
            System.out.println("Nota inválida! A nota deve ser entre 0 e 10.");
        } else {
            this.nota= valor;
            System.out.println("Nota registrada com sucesso: " + nota);
        }
    }
}

