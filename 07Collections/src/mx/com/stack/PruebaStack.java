
import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author Javier Vázquez
 */
public class PruebaStack {
    public static void main(String[] args) {
        Stack<Number> pila = new Stack<>();
        
        //usa el método push
        pila.push(12L);
        System.out.println("Se metio 12L");
        imprimirPila(pila);
        
        pila.push(34567);
        System.out.println("Se metio 34567");
        imprimirPila(pila);
        
        pila.push(1.0F);
        System.out.println("Se metio el 1.0F");
        imprimirPila(pila);
        
        pila.push(1234.5678);
        System.out.println("Se metio 1234.5678");
        imprimirPila(pila);
        
        //elimina los elementos de la pila
        try {
            Number objetoEliminado = null;
            
            //saca elementos de la pila
            while(true){
                objetoEliminado = pila.pop();
                System.out.printf("Se saco %s%n", objetoEliminado);
                imprimirPila(pila);
            }
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
    }
    
    //muestra el contenido de la pila
    private static void imprimirPila(Stack<Number> pila){
        if (pila.isEmpty()) {
            System.out.printf("La pila esta vacía%n%n");
        }
        else{
            System.out.printf("El elemento superior es: %s%n", pila.peek());
            System.out.printf("La pila contiene: %s (cima)%n", pila);
        }
    }
}
