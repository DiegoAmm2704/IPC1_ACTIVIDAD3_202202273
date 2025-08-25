
import java.util.*;
public class Calculadora {

    static Scanner sc = new Scanner(System.in);  //Objeto scanner para lectura
    public static void main(String[] args) throws Exception {
        String opcion; //Variable para leer opcion
        int a, b;  //Variable a y b
        do {
            System.out.println("------Bienvenido------");
            System.out.println("Uno. Suma");
            System.out.println("Dos. Resta");
            System.out.println("Tres. Multiplicacion");
            System.out.println("Cuatro. Division");
            System.out.println("Cinco. Potencia");
            System.out.println("Seis. Raiz");
            System.out.println("Siete. Salir");
            System.out.print("Ingrese una opcion:");
            opcion = sc.nextLine().trim().toUpperCase();

            switch (opcion) {
                    
                    case "UNO":
                        a = pedirA();
                        b = pedirB();
                        System.out.println("Resultado: " + Suma(a, b));
                        break;

                    case "DOS":
                        a = pedirA();
                        b = pedirB();
                        System.out.println("Resultado: " + Resta(a, b));
                        break;

                    case "TRES":
                        a = pedirA();
                        b = pedirB();
                        System.out.println("Resultado: " + Multiplicacion(a, b));
                        break;

                    case "CUATRO":
                        a = pedirA();
                        b = pedirB();
                        if (b != 0) {
                            System.out.println("Resultado: " + Division(a, b));
                        } else {
                            System.out.println("Error: División por cero.");
                        }
                        break;

                    case "CINCO":
                        a = pedirA();
                        b = pedirB();
                        System.out.println("Resultado: " + Potencia(a, b));
                        break;

                    case "SEIS":
                        a = pedirA();
                        b = pedirB();
                        if (a >= 0) {
                            System.out.println("Resultado: " + Raiz(a, b));
                        } else {
                            System.out.println("Error: No se puede calcular la raíz de un número negativo.");
                        }
                        break;

                    case "SIETE":
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                        break;
            }
        } while (!opcion.equals("SIETE"));
    }

    public static int pedirA(){
        System.out.print("Ingrese el valor A:");
        int a = sc.nextInt();
        sc.nextLine(); 
        return a;
    }

    public static int pedirB(){
        System.out.print("Ingrese el valor B:");
        int b = sc.nextInt();
        sc.nextLine(); 
        return b;
    }

    public static int Suma(int a, int b){
        return a + b;
    }

    public static int Resta(int a, int b){
        return a - b;
    }

    public static int Multiplicacion(int a, int b){
        return a * b;
    }

    public static double Division(int a, int b){
        return (double)a / b;
    }

    public static double Potencia(int a, int b){
        return Math.pow(a, b);
    }

    public static double Raiz(int a, int b){
       double a1 = a;
       double b1 = b;

        return Math.pow(a1, (1/b1));
    }
}
