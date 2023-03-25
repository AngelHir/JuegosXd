package PkJuegos;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("MENU AGREGAR DATOS");
            System.out.println("1. Agregar datos de un alumno");
            System.out.println("2. Agregar datos de un profesor");
            System.out.println("3. Agregar datos de un administrativo");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Juegos.agregarDatos();

                    break;
                case 2:
                    JuegoMovil.mostrarDatos();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo");
                    break;
            }
        } while (opcion != 5);
        sc.close();
    }
}


