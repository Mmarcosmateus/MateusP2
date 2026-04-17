import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = input.nextInt();

        String categoria;

        if (idade < 5) {
            categoria = "Idade insuficiente";
        } else if (idade <= 7) {
            categoria = "Infantil A";
        } else if (idade <= 10) {
            categoria = "Infantil B";
        } else if (idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade <= 17) {
            categoria = "Juvenil B";
        } else {
            categoria = "Adulto";
        }

        System.out.println("Categoria: " + categoria);

        input.close();
    }
}