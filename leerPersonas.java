import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class leerPersonas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mayoresEdad =0;
        int menoresEdad =0;
        int masculinasMayoresEdad =0;
        int femeninasMenoresEdad =0;
        int totalMujeres =0;

        //Generador de array aleatorio de personas
        Random random = new Random();
        char[] sexos={'M','F'};
        int[] edades= new int[50];
        char[] generos = new char[50];
         
        for(int i=0; i < 50; i++){
            edades[i] = random.nextInt(100);
            generos[i] = sexos[random.nextInt(2)];
        }
        System.out.println("Escriba 'LEER PERSONAS' para mostrar el array de personas generado:");
        String input = scanner.nextLine().trim().toUpperCase();

        if (input.equals("LEER PERSONAS")) {
            System.out.println("Personas generadas:");
            for (int i = 0; i < 50; i++) {
                System.out.println("Persona " + (i + 1) + ": Sexo=" + generos[i] + ", Edad=" + edades[i]);
            }
        }

        for(int i=0; i < 50; i++){
            int edad =edades[i];
            char genero = generos[i];

            if(edad>=18){
                mayoresEdad++;
                if(genero == 'M'){
                    masculinasMayoresEdad++;
                }
               else{
                totalMujeres++;                
               }
                    
            }
            else{
                menoresEdad++;
                if(genero == 'F'){
                    femeninasMenoresEdad++;
                }
                totalMujeres++;                
            }
        }
        //Porcenatajes
        double porcentajeMayoresEdad = (double) mayoresEdad/50 * 100;
        double porcentajeMujeres = (double) totalMujeres/50 *100;

        System.out.println("Cantidad de personas mayores de edad: " + mayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + masculinasMayoresEdad);
        System.out.println("Cantidad de personas demeninas menores de edad: " + femeninasMenoresEdad);
        System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de personas: " + porcentajeMayoresEdad +"%");
        System.out.println("Porcentaje que representan las mujeres respecto al total de personas: " + porcentajeMujeres + "%");
    }
}

