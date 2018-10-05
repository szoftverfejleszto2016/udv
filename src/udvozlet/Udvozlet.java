package udvozlet;

/**
 *
 * @author tothj
 */
public class Udvozlet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ember no = new Ember("Kati");
        Ember ferfi = new Ember("Zoltán");
        
        System.out.println(no.koszont());
        System.out.println(ferfi.koszont());
    }
    
}
