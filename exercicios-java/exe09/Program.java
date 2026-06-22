package testesolo.exe09;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos calcular:");
        System.out.print("Digite o primeiro numero:");
        num1 = sc.nextInt();
        System.out.print("Agora digite o segundo numero:");
        num2 = sc.nextInt();
        System.out.println("agora escolha qual operação deseja realizar:");
        System.out.printf("1 - Adição(+)%n2 - Subtração(-)%n 3 - Multiplicação (X)%n 4 - Divisão (/)");
        

        sc.close();
    }
}
