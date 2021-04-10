package Clase3.Practico;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int num1 = input.nextInt();

        System.out.println("ingrese otro numero");
        int num2 = input.nextInt();

        System.out.println("la multiplicación es " + multiplicación(num1,num2));

    }
    public static int multiplicación (int num1, int num2){
        return num1 * num2;
    }
}
