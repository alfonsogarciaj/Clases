public class Barco {
    private String matricula;
    private int eslora;
    private int yearFab;
    private String tipo;
    private int numMastiles;
    private int CvDeport;
    private int CvLujo;

    public Barco(String matricula, int eslora, int yearFab, String tipo) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.yearFab = yearFab;
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getYearFab() {
        return yearFab;
    }

    public void setYearFab(int yearFab) {
        this.yearFab = yearFab;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", yearFab=" + yearFab +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
