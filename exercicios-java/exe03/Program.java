package testesolo.exe03;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3;
        System.out.println("Vamos calcular a média da sua nota ok?");
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Agora a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Agora a terceira nota: ");
        nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;
        System.out.printf("A sua média é: %.2f%n", media);
        if (media >= 7) {
            System.out.println("Você está aprovado!");
        }else if (media >= 5 && media < 7){
            System.out.println("Você esta de recuperação");
        }else{
            System.out.println("Reprovado");
        }




        sc.close();
    }
}
