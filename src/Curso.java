import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nomeDoCurso;
    private Integer codigoDeCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private List<Aluno> matriculados = new ArrayList<>();
    private Integer quantMaxAlunos;


    public Curso(String nomeDoCurso, Integer codigoDeCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, List<Aluno> matriculados, Integer quantMaxAlunos) {
        this.nomeDoCurso = nomeDoCurso;
        this.codigoDeCurso = codigoDeCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.matriculados = matriculados;
        this.quantMaxAlunos = quantMaxAlunos;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public int getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void setCodigoDeCurso(Integer codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }

    public Integer getQuantMaxAlunos() {
        return quantMaxAlunos;
    }

    public void setQuantMaxAlunos(Integer quantMaxAlunos) {
        this.quantMaxAlunos = quantMaxAlunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codigoDeCurso == curso.codigoDeCurso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDeCurso);
    }

    public Boolean adicionarUmAluno(Aluno umAluno){
        if (matriculados.size()  <=  quantMaxAlunos){
            matriculados.add(umAluno);
            System.out.println("Aluno matriculado");
            return true;
        } else {
            System.out.println("Infelizmente o aluno não passou");
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        matriculados.remove(umAluno);
    }
}
