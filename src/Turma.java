import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Turma {

    private String codigo;
    private Professor professor;
    private Curso curso;
    private List<Aluno> listaAlunos;
    private Map<Aluno, List<Avaliacao>> avaliacaoPorAluno = new HashMap<>();

    public Turma(String codigo, Professor professor, Curso curso) {
        this.codigo = codigo;
        this.professor = professor;
        this.curso = curso;
        this.listaAlunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado com sucesso!\n");

    }

    public void removerAluno(Aluno aluno) {
        listaAlunos.remove(aluno);
        System.out.println("Aluno " + aluno.getNome() + " removido da turma.\n");
        }

    public void mostrarResumo(){
        System.out.println("===== Resumo da Turma =====");
        System.out.println("Código da turma: " + codigo);
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Curso: " + curso.getNome());

        System.out.println("Quantidade de alunos matriculados: " + listaAlunos.size());
        System.out.println("===========================\n");
    }

    public void registrarAvaliacao(Aluno aluno, Avaliacao avaliacao) {
            if (!listaAlunos.contains(aluno)) {
                System.out.println("Aluno não pertence a esta turma!");
                return;
            }

            avaliacaoPorAluno.putIfAbsent(aluno, new ArrayList<>());
            avaliacaoPorAluno.get(aluno).add(avaliacao);

            System.out.println("Avaliação registrada para " + aluno.getNome());
        }
    public void mostrarAvaliacao(Aluno aluno) {
            if(!avaliacaoPorAluno.containsKey((aluno))) {
                System.out.println("Nenhuma avaliação registrada" + aluno.getNome());
                return;
            }

            System.out.println("=== Avaliações de " + aluno.getNome() + " ===");
            for (Avaliacao a : avaliacaoPorAluno.get(aluno)){
                System.out.println(a.getDescricao() + " | Nota: " + a.getNota());
            }
            System.out.println("=====================================\n");
    }
}
