
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Javier Vázquez
 */
public class ConteoTipoPalabras {
    public static void main(String[] args) {
        //Crea HashMap para almacenar claves String y valores Integer
        Map<String, Integer> miMap = new HashMap<>();
        
        crearMap(miMap);  //crea un mapa con base en la entrada del usuario
        mostrarMap(miMap);  //muestra el contenido del mapa
    }
    
    //crea un mapa a partir de la entrada del usuario
    private static void crearMap(Map<String, Integer> map){
        Scanner scanner = new Scanner(System.in); //crea un objeto 
        System.out.println("Escriba una cadena: "); //pide la entrada del usuario
        String entrada = scanner.nextLine();
        
        //divide la entrada en tokens
        String[] tokens = entrada.split(" ");
        
        //procesamiento del texto de entrada
        for (String token : tokens) {
            String palabra = token.toLowerCase(); //obtiene la palabra en minúsculas.
            
            //Si el mapa contiene la palabra
            if (map.containsKey(palabra)) { //¿Está la palabra en el mapa?
                int cuenta = map.get(palabra); //obtiene la cuenta actual
                map.put(palabra, cuenta+1);
            }
            else{
                map.put(palabra, 1);
            }
        }
    }//fin del método crearMapa
    
    //Este método muestra el contenido del mapa
    private static void mostrarMap(Map<String, Integer> map){
        Set<String> claves = map.keySet(); //obtiene las claves
        
        //ordena las claves
        TreeSet<String> clavesOrdenadas = new TreeSet<>(claves);
        
        System.out.printf("%nEl mapa contiene: %nClave\t\tValor%n");
        
        //genera la salida para cada clave en el mapa
        for (String clave : clavesOrdenadas) {
            System.out.printf("%-10s%10s%n", clave, map.get(clave));
        }
        
        System.out.printf("Tamaño: %d%n¿Vacío?: %b%n", map.size(), map.isEmpty());
    }
}
