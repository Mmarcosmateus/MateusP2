
import java.util.Scanner;

public class exer05 {
    public static void main(String[] args) { 

        int preco = 40;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tipo de ingresso I (inteira), M (meia entrada): ");
        char n = sc.nextLine().toUpperCase().charAt(0);

        if (n == 'M') {
            double desconto = preco * 0.50;
            System.out.println("Valor a pagar: " + desconto);
        } else {
            System.out.println("Valor a pagar: " + preco);
        }
    }
}