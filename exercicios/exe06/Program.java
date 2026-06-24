package exercicios.exe06;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
            int quantidadePares = 0;
            System.out.println("Digite 10 numeros em sequencia e deixe o programa dizer quantos sao pares");
            for(int i=1; i<=10; i++){
                System.out.print("Digite o numero:");
                int num = sc.nextInt();
                if (num %2 == 0) {
                    quantidadePares +=1;
                }
            }
            System.out.println(quantidadePares);
        sc.close();
    }
}
