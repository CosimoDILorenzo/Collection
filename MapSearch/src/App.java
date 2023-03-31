import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String,Dog> m = new HashMap<>();
        Dog d1 = new Dog("Akio", "Akita inu", "large", "nfnewknk");
        m.put(d1.cip, d1);
        Dog d2 = new Dog("Nebbia", "Labrador", "large", "nkakkal");
        m.put(d2.cip,d2);

        System.out.println("Prima della rimozione");
        for (String d : m.keySet()) {
            System.out.println(m.get(d).name);
        }
        m.remove(d1.cip,d1);
        System.out.println("Dopo la rimozione");
        for (String d : m.keySet()) {
            System.out.println(m.get(d).name);
        }        

    }
}
