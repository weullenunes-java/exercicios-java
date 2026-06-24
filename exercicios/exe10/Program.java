package exercicios.exe10;

import java.util.Scanner;

public class Program {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero:");
            int numEscolha = sc.nextInt();
            for (int i = numEscolha; i >= 0 ; i--){
                System.out.println(i);
            }
            System.out.println("Fim!");
        sc.close();
    }
}
