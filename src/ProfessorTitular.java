public class ProfessorTitular extends Professor {
    private String especialidade;


    public ProfessorTitular(String especialidade) {
        this.especialidade = especialidade;

    }

    public ProfessorTitular(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoDeProfessor, String especialidade) {
        super(nome, sobrenome, tempoDeCasa, codigoDeProfessor);
        this.especialidade = especialidade;
    }
}
