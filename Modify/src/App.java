import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Person a = new Person("Cosimo", "Di Lorenzo");
        Person b = new Person("Marco", "Rossi");
        Person c = new Person("Luca", "Napoli");

        ArrayList<Person> people = new ArrayList<>();
        people.addAll(List.of(a,b,c));
        
        System.out.println("Inserisci nome da modificare");
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        System.out.println("Inserire nome da modificare");
        String nome = scan.nextLine();

        System.out.println("Inserire cognome da modificare");
        String cognome = scan.nextLine();
        Person mod = new Person(nome, cognome);
        int idx = 0;
        for (Person p : people) {
            if(p.name.equals(n)) {
                idx = people.indexOf(p);
            }
        }
        people.set(idx,mod);
        for (Person p : people) {
            System.out.println(p.print());
        }
    }
}
