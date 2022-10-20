package paquete.clases;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    int[] edad;
        edad = new int[10];
        Scanner sc = new Scanner(System.in);
        //Llenando random
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Ingrese la edad: ");
            edad[i] = sc.nextInt();
        }
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad "+ (i+1)+ " " + edad[i]);
        }
    }  
}

