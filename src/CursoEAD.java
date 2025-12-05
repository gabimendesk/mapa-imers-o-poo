public class CursoEAD extends Curso {

    private String plataforma;

    public CursoEAD(String nome, String codigo, int cargaHoraria, String plataforma){
        super(nome, codigo, cargaHoraria);
        this.plataforma = plataforma;
    }

    @Override
    public void exibirInfo(){
        System.out.println("=== Curso EAD ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Código: " + getCodigo());
        System.out.println("Carga Horária: " + getCargaHoraria() + "h");
        System.out.println("Plataforma Virtual: " + plataforma);
    }
}
