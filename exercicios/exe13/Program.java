package exercicios.exe13;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        String loginCorreto = "logincorreto@gmail.com";
        String senhaCorreta = "senhacorreta123";

        Scanner sc = new Scanner(System.in);

        int tentativas = 3;

        while (tentativas > 0) {

            System.out.print("Login: ");
            String login = sc.next();

            System.out.print("Senha: ");
            String senha = sc.next();

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso liberado");
                break;
            }

            tentativas--;

            if (tentativas > 0) {
                System.out.println("Login ou senha incorretos.");
                System.out.println("Tentativas restantes: " + tentativas);
            } else {
                System.out.println("Conta bloqueada.");
            }
        }

        sc.close();
    }
}