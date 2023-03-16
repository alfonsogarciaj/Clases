public class ClaseGeneraExcepciones  {
    public static void main(String[] args){
        try {
            throw new Exception("Es una Excepcion");
        } catch(Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        } finally {
            System.out.println("Esto se ejecuta si o si");
        }
    }
}