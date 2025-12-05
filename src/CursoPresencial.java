public class CursoPresencial extends Curso {

    private String sala;

    public CursoPresencial(String nome, String codigo, int cargaHoraria, String sala) {
        super(nome, codigo, cargaHoraria);
        this.sala = sala;
    }

    @Override
    public void exibirInfo(){
        System.out.println("=== Curso Presencial ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Código: " + getCodigo());
        System.out.println("Carga Horária: " + getCargaHoraria() + "h");
        System.out.println("Sala de aula: " + sala);
    }
}
