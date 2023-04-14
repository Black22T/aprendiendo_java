package programacion_practica;

import java.util.Scanner;
public class ej05LeerDosNumeros {
    public static void main(String[] args) {
        double n1, n2, a, b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese dos numeros a operar:");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        sc.close();
        a = n1*2+Math.pow(n2,2);
        b = (Math.pow(n1,3)+Math.pow(n2,3))/2;
        System.out.println("La suma del doble del primero más el cuadrado del segundo = "+ a);
        System.out.println("El promedio de sus cubos = "+ b);
    }
}