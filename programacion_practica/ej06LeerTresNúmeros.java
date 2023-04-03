package programacion_practica;
import java.util.Scanner;

public class ej06LeerTresNúmeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int c = sc.nextInt();

        a = a * 100+ b * 10 + c;

        System.out.println("Resultado = " + a); // Se muestra el precio del boleto al usuario

        sc.close(); // Se cierra el objeto Scanner
    }
}
