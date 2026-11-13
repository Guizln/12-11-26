import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Olá, " + nome + "!");
        System.out.println("O dobro de " + numero + " é " + (numero * 2) + ".");
        System.out.println(numero % 2 == 0 ? "O número é par." : "O número é ímpar.");

        scanner.close();
    }
}