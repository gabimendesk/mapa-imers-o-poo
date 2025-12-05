public class Main {
    public static void main(String[] args){

        Aluno a1 = new Aluno("Gabriela Mendes", "24228769", "Sistemas de Informação");
        Aluno a2 = new Aluno("Caroline Freitas", "2321015", "Sistemas de Informação");

        Professor p1 = new Professor("Guilherme Avelino", "Programação", "REG-01");
        Curso c1 = new Curso("Engenharia de Software", "EG-01", 120);

        Turma t1 = new Turma("T01", p1,c1);

        t1.adicionarAluno(a1);

        Avaliacao av1 = new Avaliacao("Prova 1");
        av1.atribuirNota(9.5);

        t1.registrarAvaliacao(a1, av1);

        t1.mostrarAvaliacao(a1);

        t1.adicionarAluno(a2);

        t1.mostrarResumo();

        t1.removerAluno(a1);

        t1.mostrarResumo();

        CursoPresencial cp = new CursoPresencial("Engenharia de Software", "EG-01", 120, "Sala 203");
        CursoEAD ce = new CursoEAD("Sistemas de Informação", "SI-02", 200, "Studeo");

        cp.exibirInfo();
        System.out.println();
        ce.exibirInfo();
    }
}
