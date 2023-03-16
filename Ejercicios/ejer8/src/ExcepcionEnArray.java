public class ExcepcionEnArray {
   int[] array = {0, 1, 2, 3, 4, 5};
   int getValor(int indice) {
       return array[indice];
    }
    public static void main(String[] args) {
       ExcepcionEnArray ea = new ExcepcionEnArray();
       try {
           ea.getValor(6);
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Excepción: indice de array fuera de limites" + e.getMessage());
       }
   }
}