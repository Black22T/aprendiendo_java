package practica14042023;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class ej01Amejorado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu fecha de nacimiento en formato dd/mm/aaaa: ");
        String fechaNacimiento = sc.nextLine();
        String[] fechaArray = fechaNacimiento.split("/");
        int dia = Integer.parseInt(fechaArray[0]);
        int mes = Integer.parseInt(fechaArray[1]);
        int anio = Integer.parseInt(fechaArray[2]);
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNac = LocalDate.of(anio, mes, dia);
        Period periodo = Period.between(fechaNac, fechaActual);
        System.out.println("Tu edad exacta es: " + periodo.getYears() + " años, " + periodo.getMonths() + " meses y " + periodo.getDays() + " días.");
    }
}

