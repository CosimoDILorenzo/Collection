import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Auto macchina1 = new Auto("Audi", "A3", "nero", 5);
        Auto macchina2 = new Auto("Bmw", "Serie1", "rosso", 5);
        Auto macchina3 = new Auto("Bmw", "X1", "blu", 5);
        Auto macchina4 = new Auto("Mercedes", "Classe A", "bianco", 5);
        Auto macchina5 = new Auto("Mercedes", "Smart", "bianco", 3);


        ArrayList<Auto> cars = new ArrayList<Auto>();
        cars.addAll(List.of(macchina1,macchina2,macchina3,macchina4,macchina5));
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci marca:");
        String marca = scan.nextLine();
        System.out.println("Inserisci modello:");
        String modello = scan.nextLine();
        System.out.println("Inserisci colore:");
        String colore = scan.nextLine();
        System.out.println("Inserisci numero porte:");
        int porte = scan.nextInt();
        Auto macchina6 = new Auto(marca, modello, colore, porte);
        cars.add(macchina6);
        System.out.println(cars.toString());
    }
}
