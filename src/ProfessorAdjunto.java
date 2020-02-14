public class ProfessorAdjunto extends Professor {
    private Integer horasDeMonitoria;

    public ProfessorAdjunto(Integer horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }

    public int getHorasDeMonitoria() {
        return horasDeMonitoria;
    }

    public void setHorasDeMonitoria(Integer horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }
}
