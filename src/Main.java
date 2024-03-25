import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Komputer> komputers = new ArrayList<>();
        KomputerWindows windows = new KomputerWindows("i7-11300", "BeQuiet", "MSI");
        KomputerMac mac = new KomputerMac("Jakiś procek", "BeQuiet", "Asrock");

        komputers.add(windows);
        komputers.add(mac);

        Collections.sort(komputers);
        for (Komputer komputer: komputers){
            System.out.println(komputer);
        }
    }
}