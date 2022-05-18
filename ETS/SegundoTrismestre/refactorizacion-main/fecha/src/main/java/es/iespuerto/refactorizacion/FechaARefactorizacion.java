package es.iespuerto.refactorizacion;

public class FechaARefactorizacion {

    private int dia;
    private int mes;
    private int anio;

    public FechaARefactorizacion(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int diasDelmes() {

        int diasMes = 0;
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
            case 2:
                if (bisiesto()) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;
            default:
                diasMes = 31;
                break;
        }
        return diasMes;
    }

    public boolean bisiesto() {
        if ((anio % 400 == 0) ||
                ((anio % 4 == 0) && (anio % 100 != 0))) {
            return true;
        } else
            return false;
    }

    public boolean validaDiaMes() {

        if (dia < 1 || dia > 31) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia > diasDelmes()) {
            return false;

        } else {
            return true;
        }
    }

}
