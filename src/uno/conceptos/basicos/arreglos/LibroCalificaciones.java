/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno.conceptos.basicos.arreglos;

/**
 *
 * @author Windows10
 */
public class LibroCalificaciones {

    private String nombreCurso;
    private int[][] calificaciones;

    public LibroCalificaciones(String curso, int[][] calificaciones) {
        this.nombreCurso = curso;
        this.calificaciones = calificaciones;

    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int[][] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[][] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void procesarInformacion() {
        this.imprimirCalificaciones();
        System.out.printf("%n%s %d%n%s %d",
                "La calificacion mas baja es",
                this.obtenerMinima(),
                "La calificacion mas alta es",
                this.obtenerMaxima()
        );
        System.out.println("");
        this.imprimirGrafica();
    }

    private void imprimirCalificaciones() {
        System.out.printf("Las calificaciones son: %n%n");
        System.out.print("                ");
        
        //== crea un encabezado de columna para cada una de las pruebas
        for (int prueba = 0; prueba < calificaciones[0].length; prueba++) {
            System.out.printf("Prueba %d", prueba+1);
            
        }
        System.out.println("Promedio");
        
        //==crea filas/columna de texto que representan el arreglo calificaciones
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d",estudiante+1);
            //== imprime calificaciones de estuadiantes
            for(int prueba: calificaciones[estudiante]){
                System.out.printf("%8d",prueba);
            }
            
            //==llama al meytodo para calcular la calificacion promedio del estudiante
            //==pasa la fila de calificaciones como argumento para obtener el promedio
            double promedio=obtenerPromedio(calificaciones[estudiante]);
            System.out.printf("%9.2f%n",promedio);
        }
         
    }

    private void imprimirGrafica() {
        System.out.println("Distribucion de calificaciones en general");
        
        //== almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones
        int [] frecuencia= new int[11];
        
        //==para cada calificacion en libro incrementa la frecuancia
    }

    private int obtenerMinima() {
        int caliMinima = this.calificaciones[0][0];

        for (int[] calificacionEstudiante : calificaciones) {
            for (int calificacion : calificacionEstudiante) {
                if (calificacion < caliMinima) {
                    caliMinima = calificacion;
                }
            }
        }

        return caliMinima;
    }

    private int obtenerMaxima() {
        int caliMaxima = this.calificaciones[0][0];

        //itera filas
        for (int[] calificacionEstudiante : calificaciones) {
            for (int calificacion : calificacionEstudiante) {
                if (calificacion > caliMaxima) {
                    caliMaxima = calificacion;
                }
            }
        }

        return caliMaxima;
    }

    private double obtenerPromedio(int[] calificacione) {
        double resultado=0.0;
        for(int calificacion: calificacione){
            resultado+=calificacion;
        }
       return resultado/calificacione.length;
    }

}
