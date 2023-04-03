package programacion_practica2;
import java.util.Scanner;


public class ej01PromedioCalificacion {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota de los tres examenes: ");
        a = sc.nextInt();
        b = a;
        a = sc.nextInt();
        b = a +b;
        a = sc.nextInt();
        sc.close();
        b = b + a;
        a=b/3;
        if (a>=60){
            System.out.println("El alumno aprobo con un promedio de: "+ a);
        }
        else {
            System.out.println("El alumno desaprobo con un promedio de: "+ a);
        }
    }
}
