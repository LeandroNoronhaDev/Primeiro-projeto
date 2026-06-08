import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Olá " + nome + ", sua idade é " + idade + " anos");

        if (idade >= 18){
            System.out.println(nome + " é maior de idade!");
        } else {
            System.out.println("É menor de idade!");
        }
    }
}
