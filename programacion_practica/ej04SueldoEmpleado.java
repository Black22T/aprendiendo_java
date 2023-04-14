package programacion_practica;

import java.util.Scanner;

public class ej04SueldoEmpleado {
    public static void main(String[] args) {
        double hs, phs, hsex, su, suex;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el número de horas de trabajadas: ");
        hs = sc.nextDouble();
        while (hs<=0){
            System.out.println("El numero de horas trabajadas debe de ser superior a 0");
            System.out.println("Por favor ingrese nuevamente el valor");
            hs = sc.nextDouble();
        }
        System.out.println("Ingrese el número de horas EXTRAS trabajadas: ");
        hsex = sc.nextDouble();
        while (hsex<=0){
            System.out.println("El numero de horas EXTRAS debe de ser superior a 0");
            System.out.println("Por favor ingrese nuevamente el valor");
            hsex = sc.nextDouble();
        }
        System.out.println("Sueldo por hora: ");
        phs = sc.nextDouble();
        while (phs<=0){
            System.out.println("El sueldo por hora debe de ser superior a 0");
            System.out.println("Por favor ingrese nuevamente el valor");
            phs = sc.nextDouble();
        }
        sc.close();
        suex = hsex*(phs*2.0);
        su = phs*hs;
        System.out.println("El sueldo por las horas trabajadas es de: $"+ su);
        System.out.println("El pago por las horas extra es de:        $"+ suex);
        su = su+suex;
        System.out.print("El total del sueldo sera de:              $"+su);
    }
}
