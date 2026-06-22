package testesolo.exe05;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para ver a tabuada de 1 a 10:");
        int numTabuada = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(numTabuada + " x " + i + " = " + (numTabuada * i));
        }
        sc.close();
    }
}
