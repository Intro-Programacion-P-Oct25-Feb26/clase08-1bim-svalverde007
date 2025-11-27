/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 (Muy buena) del estudiante rené
Calificación 4 (Buena) del estudiante rolando

Promedio de calificaciones: 8,50

---
Si la nota es mayor o igual a 5 es un nota "Muy buena", caso contrario es buena
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadenaFinal;
        int nota;
        int salida;
        String nombre;
        String nota1;
        double promedio;
        boolean bandera = true;
        int suma = 0;
        int contador_calificaciones = 0;

        cadenaFinal = "Listado de Notas\n";

        do {
            System.out.println("Ingrese el nombre del estudiante");
            nombre = entrada.nextLine();

            System.out.println("Ingrese calificación del estudiante");
            nota = entrada.nextInt();


            suma = suma + nota;

            contador_calificaciones = contador_calificaciones + 1;
            if (nota >= 5) {
                nota1 = "muy buena";
            } else {
                nota1 = "Buena";
            }
            cadenaFinal = String.format("%sCalificación %d (%s) "
                    + "del estudiante %s\n",
                    cadenaFinal,
                    nota,
                    nota1,
                    nombre);
            System.out.println("Ingrese (-111) si desea salir del ciclo; "
                    + "cualquier otro número para continuar");
            salida = entrada.nextInt();
            entrada.nextLine();
            if (salida == -111) {
                bandera = false;
            }
          

        } while (bandera);
        promedio = (double) suma / contador_calificaciones;
        cadenaFinal = String.format("%s\nPromedio de calificaciones: %.2f",
                cadenaFinal,
                promedio);
        System.out.printf("%s\n", cadenaFinal);
    }
}
