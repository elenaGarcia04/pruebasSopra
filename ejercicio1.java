import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            for (int i = numero; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else {
            for (int i = numero; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

