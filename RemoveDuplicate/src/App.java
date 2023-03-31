import java.util.ArrayList;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        //* Creo la lista
        ArrayList<String> person = new ArrayList<>();
        // * Aggiungo gli elementi
        person.add("Marco");
        person.add("Cosimo");
        person.add("Giovanni");
        person.add("Giovanni");
        person.add("Michele");
        person.add("Cosimo");
        person.add("Michele");
        person.add("Marco");
        
        //* Creo una Set ed inserisco la lista, così elimina gli elementi univoci.
        HashSet<String> set = new HashSet<>(person);
        //* Pulisco la lista
        person.clear();
        //* Aggiungo la set nella lista
        person.addAll(set);        
        System.out.println(person);
        

    }
}
