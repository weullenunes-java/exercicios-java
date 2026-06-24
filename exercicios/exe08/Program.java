package exercicios.exe08;

import java.util.Scanner;

public class Program{
    public static void main(String[] args) {
        String senhaCorreta = "senhaCorreta132";
        Scanner sc = new Scanner(System.in);
        String senha;
            do {
                System.out.println("Digite sua senha:");
                senha = sc.next();
                if (!senhaCorreta.equals(senha)) {
                    System.out.println("Senha incorreta");
                    senha = sc.next();
                }
            } while (!senhaCorreta.equals(senha));
            System.out.println("Senha correta!");
        sc.close();
    }
}
