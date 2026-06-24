package exercicios.exe12;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor que deseja sacar:");
        int notas100, notas50, notas20, notas10, notas5, notas1;
        int valorSaque = sc.nextInt();
        int resto = valorSaque;
        notas100 = resto/100;
        resto = resto%100;
        notas50 = resto / 50;
        resto = resto%50;
        notas20 = resto / 20;
        resto = resto%20;
        notas10 = resto / 10;
        resto = resto%10;
        notas5 = resto / 5;
        resto = resto % 5;
        notas1 = resto / 1;
        System.out.println("notas de 100 " + notas100);
        System.out.println("notas de 50 " + notas50);
        System.out.println("notas de 20 " + notas20);
        System.out.println("notas de 10 "+ notas10);
        System.out.println("ntoas de 5 " + notas5);
        System.out.println("notas de 1 " + notas1);
        sc.close();
    }
}
