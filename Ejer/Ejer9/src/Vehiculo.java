public class Vehiculo {
    private Marca marca;
    private Modelo modelo;

    private Propietario dueño;

    private CveVehicular cveVehicular;

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Propietario getDueño() {
        return dueño;
    }

    public void setDueño(Propietario dueño) {
        this.dueño = dueño;
    }

    public CveVehicular getCveVehicular() {
        return cveVehicular;
    }

    public void setCveVehicular(CveVehicular cveVehicular) {
        this.cveVehicular = cveVehicular;
    }
}
