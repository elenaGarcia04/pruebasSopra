import java.util.Scanner;

public class salarioTrabajador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double horasTrabajadas =0;
        double tarifa =0;
        double sueldo =0;

        System.out.print("Introduce las horas trabajadas: ");
        horasTrabajadas = scanner.nextInt();
        System.out.print("Introduce la tarifa por hora: ");
        tarifa = scanner.nextInt();

        if(horasTrabajadas>40){
        double horasExtras = (double)horasTrabajadas - 40;
        sueldo = (double)(40 *tarifa) + (horasExtras * (tarifa * 1.5));
        }
        else{
            sueldo = (double)horasTrabajadas* tarifa;
        }
        System.out.println("El sueldo es: " + sueldo);

    }
}
