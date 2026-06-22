package testesolo.exe01;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos treinar!");
        System.out.println("Digite dois números e deixe o programa dizer qual é o maior.");

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O número maior é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O número maior é: " + num2);
        } else {
            System.out.println("Os números são iguais.");
        }

        sc.close();
    }
}