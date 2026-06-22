package testesolo.exe04;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            System.out.println("Vamos converter os graus Celsius para Fahrenheit");
            System.out.print("Escreva a quantidade de graus em Celsius: ");
            double Celsius = sc.nextDouble();
            double fahrenheit = (Celsius * 9/5) + 32;
            System.out.printf("A temperatura em Fahrenheit é: %.2f", fahrenheit);
        
        sc.close();
    }
}
