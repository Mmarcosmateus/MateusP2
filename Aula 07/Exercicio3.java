import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double precoGasolina = 6.5;
        double precoAlcool = 5.4;

        System.out.print("Tipo (A-álcool / G-gasolina): ");
        char tipo = leitor.next().toUpperCase().charAt(0);

        System.out.print("Quantidade de litros: ");
        double litros = leitor.nextDouble();

        double desconto = 0;
        double precoLitro = 0;

        if (tipo == 'A') {
            precoLitro = precoAlcool;

            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }

        } 
        
        if (tipo == 'G') {
            precoLitro = precoGasolina;

            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        }

        double total = litros * precoLitro;
        double valorComDesconto = total - (total * desconto);

        System.out.printf("Total a pagar: R$ %.2f\n", valorComDesconto);

        leitor.close();
    }
}