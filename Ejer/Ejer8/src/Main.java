import java.util.Date;

public class Main implements ServMedico{
    public static void main(String[] args) {
        Alumno alumno = new Alumno("547474H","Derecho");
        Docente docente = new Docente("44F",new Date(),new CVitae("Gestoria"));
    }

    @Override
    public void regProveedor() {

    }

    @Override
    public void regVigenciaServicio() {

    }

    @Override
    public void regNSegS() {

    }
}