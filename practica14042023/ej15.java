package practica14042023;
//1 segunda pagina

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        int dif, anios, anios_act;
        Scanner sc = new Scanner(System.in);
        System.out.println("Anio de nacimiento: ");
        anios = sc.nextInt();
        System.out.println("anio actual: ");
        anios_act = sc.nextInt();
        sc.close();
        dif= anios_act - anios;
        if (dif>=18) {
            System.out.println("Es mayor de edad y su edad es " + dif);
        }
        else {
            System.out.println("Es menor de edad y su edad es " + dif);
        }
    }
}
