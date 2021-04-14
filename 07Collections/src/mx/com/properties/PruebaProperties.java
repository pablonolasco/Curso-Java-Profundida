
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author Javier Vázquez
 */
public class PruebaProperties {
    
    public static String color_ventana;
    public static String anchura;
    
    public static void main(String[] args) {
        Properties props = new Properties();
        
        //establece las propiedades
        props.setProperty("color", "azul");
        props.setProperty("anchura", "200");
        props.setProperty("password", "123");
        
        System.out.println("Después de establecer propiedades");
        listarPropiedades(props);
        
        //reemplaza el valor de una propiedad
        props.setProperty("color", "rojo");
        
        System.out.println("Después de reemplazar propiedades");
        listarPropiedades(props);
        
        guardarPropiedades(props);
        
        props.clear();
        
        System.out.println("Después de borrar propiedades");
        listarPropiedades(props);
        
        cargarPropiedades(props);
        
        //Obtiene el valor de la propiedad "color"
        Object valor = props.getProperty("password");
        
        // comprueba si el valor está en la tabla
        if (valor != null) {
            System.out.printf("El valor de la propiedad color es: %s%n", valor);
            color_ventana = (String)valor;
        }
        else{
            System.out.println("La propiedad color no está en la tabla");
        }
    }
    
    //guarda las propiedades en un archivo
    private static void guardarPropiedades(Properties props){
        //guarda el contenido del objeto Properties
        try {
            FileOutputStream salida = new FileOutputStream("props.properties");
            props.store(salida, "Propiedades de ejemplo"); //guarda las propiedades
            salida.close();
            System.out.println("Después de guardar las propiedades");
            listarPropiedades(props);
        } catch (IOException ioe) {
            
            ioe.printStackTrace();
            
        }
    }
    
    //carga las propiedades desde un archivo
    private static void cargarPropiedades(Properties props){
        //carga el contenido en props=null
        try {
            FileInputStream entrada = new FileInputStream("props.properties");
            props.load(entrada); //carga las propiedades.
            entrada.close();
            System.out.println("Después de cargar las propiedades");
            listarPropiedades(props);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    //imprime los valores de las propiedades.
    private static void listarPropiedades(Properties props){
        Set<Object> claves = props.keySet(); //obtiene los nombres de las propiedades.
        
        //imprime los pares clave/valor
        for (Object clave : claves) {
            System.out.printf("%s\t%s%n", clave, props.getProperty((String) clave));
        }
 
        System.out.println();
    }
    
}
