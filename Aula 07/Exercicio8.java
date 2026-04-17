import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.print("Deseja a tabuada de qual número? ");
        int numeroEscolhido = dados.nextInt();

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            int produto = numeroEscolhido * multiplicador;
            System.out.println(numeroEscolhido + " x " + multiplicador + " = " + produto);
        }
        dados.close();
    }
}