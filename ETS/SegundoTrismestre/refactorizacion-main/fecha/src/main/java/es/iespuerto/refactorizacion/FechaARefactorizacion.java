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
    
    public boolean dia(){
        
        if (dia < 1 || dia > 31){
            return false;
        }
            
        
        return true;
    }

    public boolean mes(){
        if (mes < 1 || mes > 12)
            return false;
        
        return true;
    }


    public boolean valida() {

        dia();
        mes();


        // determinamos la cantidad de días del mes:
        int diasMes = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
            case 2:
                bisiesto();
                break;
        }
        if (dia > diasMes)
            return false;
        else
            return true;
    }

    public boolean bisiesto() {
        int diasMes;
        if ((anio % 400 == 0) ||
                ((anio % 4 == 0) && (anio % 100 != 0))) {
            diasMes = 29;
            return true;
        } else
            diasMes = 28;
        return false;
    }

}
