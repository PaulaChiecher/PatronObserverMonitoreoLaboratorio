public class Laboratorio {
    private Investigador investigador;
    private String resultadoExperimento;
    public void suscribir(Investigador investigador) {
        this.investigador = investigador;
    }
    public void desuscribir() {
        this.investigador = null;
    }
    public void notificarInvestigador() {
        if (investigador != null) {
            investigador.actualizar(resultadoExperimento);
        }
    }
    public String getResultadoExperimento() {
        return resultadoExperimento;
    }

    public void setResultadoExperimento(String resultadoExperimento) {
        this.resultadoExperimento = resultadoExperimento;
        notificarInvestigador();
    }
}
