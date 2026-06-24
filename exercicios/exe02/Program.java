package exercicios.exe02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Vamos descobrir se o numero é impar ou par!");
            System.out.print("Digite o numero: ");
            int num = sc.nextInt();
            if (num%2 == 0) {
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
    
        sc.close();
    }
}
