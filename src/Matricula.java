import java.util.Date;

public class Matricula {
    private Date dataDoDia;
    private Aluno aluno;
    private Curso curso;

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        Date dataDoDia = new Date();
    }
}
