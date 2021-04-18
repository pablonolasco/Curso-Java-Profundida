package mx.com.stream;
import java.util.stream.IntStream;

/**
 * @author Javier Vázquez
 */
public class OperacionesIntStream {

    public static void main(String[] args) {
        // programacion funcional 
        // no dice como lo va a hacer sino que es lo que quiero hacer
        //se encarga de solo hacer las cosas, no pregunta el como
        // Interfaz funcional es aquella que tiene solo un metodo abstracto     
        
        
        //origen de datos.
        int[] valores = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        //muestra los valores originales
        System.out.print("Valores originales: ");
        //accion que obtiene un stream a partir de un origen de datos.
        // of recibe una data de tipo int
        // 1-. Inicio de flujo
        IntStream.of(valores)
        // 2-. Realizar Operaciones intermedias, son aquellas que producen un nuevo flujo        
        // 3-. Operacion terminal, en este caso se pasa a directamente a operacion terminal   
                .forEach(
                        // Expresion lambda
                        // parametro, si es mas de uno se coloca (valor1, valor2, valor3) 
                        valor ->
                        // Si tiene mas de una linea se colocan llaves
                        {
                            System.out.printf("%d ", valor);
                            System.out.printf(",");
                            
                        });
        System.out.println();

        //cuenta, min, max, suma y promedio de valores
        // regresa un optional getAsInt 
        System.out.printf("%nCuenta: %d%n", IntStream.of(valores).count());
        System.out.printf("Min: %d%n", IntStream.of(valores).min().getAsInt());
        System.out.printf("Max: %d%n", IntStream.of(valores).max().getAsInt());
        System.out.printf("Suma: %d%n", IntStream.of(valores).sum());
        System.out.printf("Promedio: %.2f%n", IntStream.of(valores).average().getAsDouble());
        // Conjunto de todos los metodos anteriores
        // Summary statics: IntSummaryStatistics{count=10, sum=55, min=1, average=5.500000, max=10}
        System.out.printf("Summary statics: %s", IntStream.of(valores).summaryStatistics());

        //suma de valores con el método reduce
        System.out.printf("%nSuma mediante el método reduce: %d%n",
                // Iteracion 1: x se le asigna el valor del primero parametro en este caso 0
                // Iteracion 2: x se le asigna el valor de la suma x=0, y=3 = 0+3
       // Iteracion 3: x se le asigna el valor de la suma de la iteracion anterior x=3, y=10 = 3+13
       // Iteracion 4: x se le asigna el valor de la suma de la iteracion anterior x=13, y=6 = 13+6
                IntStream.of(valores).reduce(0, (x, y) -> x + y));

        //suma de cuadrados de los valores con el método reduce
        System.out.printf("Suma de cuadrados mediante el método reduce: %d%n",
                IntStream.of(valores).reduce(0, (x, y) -> x + y * y));

        //producto de los valores con el método reduce
        System.out.printf("Producto mediante el método reduce: %d%n",
                IntStream.of(valores).reduce(1, (x, y) -> x * y));

        //valores pares mostrados en orden
        System.out.printf("%nValores pares mostrados en orden: ");
        IntStream.of(valores)
                .filter(valor -> valor % 2 == 0)
                .sorted()
                .forEach(valor -> System.out.printf("%d ", valor));
        System.out.println();

        //valores impares multiplicados por 10 y mostrados en orden
        System.out.printf(
                "Valores impares multiplicados por 10 y mostrados en orden: ");
        IntStream.of(valores)
                .filter(valor -> valor % 2 != 0)
                .map(valor -> valor * 10)
                .sorted()
                .forEach(valor -> System.out.printf("%d ", valor));
        System.out.println();

        //suma el rango de enteros del 1 al 10, exclusivo
        System.out.printf("%nSuma de enteros del 1 al 9: %d%n", IntStream.range(1, 10).sum());

        //suma el rango de enteros de 1 al 10, inclusivo
        System.out.printf("Suma de enteros del 1 al 10: %d%n",
                IntStream.rangeClosed(1, 10).sum());
    }
}
