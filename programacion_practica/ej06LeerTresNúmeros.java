package programacion_practica;
import java.util.Scanner;

public class ej06LeerTresNúmeros {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        b = sc.nextInt();
        System.out.println("Ingrese el tercer número: ");
        c = sc.nextInt();

        a = a * 100+ b * 10 + c;

        System.out.println("Resultado = " + a); // Se muestra el precio del boleto al usuario

        sc.close(); // Se cierra el objeto Scanner
    }
}
