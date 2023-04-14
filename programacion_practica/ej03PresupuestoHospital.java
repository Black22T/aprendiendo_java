package programacion_practica;
import java.util.Scanner;

public class ej03PresupuestoHospital {
    public static void main(String[] args) {
        double pre, ur, pe, tra;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el presupuesto total: ");
        pre = sc.nextDouble();
        while (pre<=0){
            System.out.println("El presupuesto debe de ser mayor a 0, ingrese el valor nuevamente: ");
            pre = sc.nextDouble();
        }
        sc.close();
        ur = pre*0.37;
        pe = pre*0.42;
        tra = pre*0.21;
        System.out.print("El presupuesto destinado a Urgencia es de $"+ ur);
        System.out.print(", a Pediatria es de $"+pe);
        System.out.print(" y a Traumatologia es de $"+tra);
    }
}
