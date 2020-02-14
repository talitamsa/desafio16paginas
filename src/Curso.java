public class Curso {
    private String nomeDoCurso;
    private int codigoDeCurso;

    public Curso(String nomeDoCurso, int codigoDeCurso) {
        this.nomeDoCurso = nomeDoCurso;
        this.codigoDeCurso = codigoDeCurso;
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

    public void setCodigoDeCurso(int codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }
}
