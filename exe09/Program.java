package exercicios.exe09;

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
        System.out.printf("1 - Adição(+)%n2 - Subtração(-)%n3 - Multiplicação (X)%n4 - Divisão (/)%nSua escolha:");
        int opcao = sc.nextInt();

        while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
            System.out.println("Insira a operação correta");
            opcao = sc.nextInt();
        }
        if (opcao == 1) {
            System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
        }else if (opcao == 2){
            System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
        }else if (opcao == 3){
            System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
        }else if (opcao == 4){
            System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
        }else{
            System.out.println("Operação errada, escolha a opção correta");
        }
        sc.close();
    }
}
