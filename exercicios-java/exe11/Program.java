package testesolo.exe11;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        int numSecret = 7;
        int numPlayer;
        System.out.println("Vamos adivinhar o numero secreto, valendo uma coxinha ;D");
        System.out.println("Tente adivinhar o numero secreto");
        Scanner sc = new Scanner(System.in);
        do {
            numPlayer = sc.nextInt();
            if (numPlayer <= (numSecret-5)) {
                System.out.println("Muito baixo");
                
            }else if(numPlayer < numSecret && numPlayer > (numSecret-5)){
                System.out.println("Quase lá, um pouco mais");
            }else if(numPlayer >= (numSecret+5)){
                System.out.println("Muito alto");
            }else if (numPlayer > numSecret && numPlayer < (numSecret+5)) {
                System.out.println("Quase lá, um pouco menos");
            }else if(numPlayer == numSecret){
                System.out.println("Parabens, você acertou");
            }
        } while (numPlayer != numSecret);
        sc.close();
    }
}
