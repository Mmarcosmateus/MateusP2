import java.util.Scanner;

public class exer06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.print("Digite a palavra: ");
        String palavra = sc.nextLine();

        int posicao = frase.indexOf(palavra);

        System.out.println(posicao);

        sc.close();
    }
}