import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alquiler> alquileres = new ArrayList<>();
        alquileres.add(new Alquiler("Pedro","45354566G",12,2,"Parking 3",
                new Barco("444G",54,2022,"Velero")));
        alquileres.add(new Alquiler("Alfonso","255444H",7,6,"Parking 7",
                new Barco("888H",78,2021,"Deportivo")));
        alquileres.add(new Alquiler("Ana","2345345G",23,5,"Parking 10",
                new Barco("467I",67,2020,"Lujo")));
        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler.toString());
        }

    }
}