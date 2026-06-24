package exercicios.exe14;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double nota;
        int quantidadeDeAlunos = 0;
        System.out.printf("1 - Cadastrar aluno%n2 - Ver quantidade de alunos cadastrados%n3 - Encerrar%n");
        int escolha = sc.nextInt();
        while (escolha != 3) {
            if (escolha != 1 && escolha != 2) {
                System.out.println("Escolhaa uma opção valida:");
                escolha = sc.nextInt();
            }else if(escolha == 1) {
                System.out.println("Cadastro");
                System.out.print("Nome: ");
                nome = sc.next();
                System.out.print("Idade: ");
                idade = sc.nextInt();
                System.out.print("Nota: ");
                nota = sc.nextDouble();
                quantidadeDeAlunos++;
                System.out.printf("1 - Cadastrar aluno%n2 - Ver quantidade de alunos cadastrados%n3 - Encerrar%n");
                escolha = sc.nextInt();
            }else if(escolha == 2){
                System.out.println(quantidadeDeAlunos);
                System.out.printf("1 - Cadastrar aluno%n2 - Ver quantidade de alunos cadastrados%n3 - Encerrar%n");
                escolha = sc.nextInt();
            }
        }
        System.out.println("Programa encerrado");

        sc.close();
    }
}
