package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime el radio\n");
        double radio = sc.nextDouble();
        final double PI = 3.14578;
        double area = PI * radio * radio;
        double perimetro = 2 * PI * radio;
        System.out.println("El area es "+area);
        System.out.println("El perimetro es "+perimetro);

    }
}