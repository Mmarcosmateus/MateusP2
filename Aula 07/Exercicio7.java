import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = entrada.next();

        String invertida = "";

        int tamanho = palavra.length();

        for (int i = tamanho - 1; i >= 0; i--) {
            invertida = invertida + palavra.charAt(i);
        }

        System.out.println("Palavra invertida: " + invertida);

        entrada.close();
    }
}