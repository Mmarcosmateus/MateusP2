import java.util.Scanner;
public class exer04 {
    public static void main(String[] args) { 
    double gasolina=6.50;
    Scanner sc=new Scanner(System.in);
    System.out.print("Informe a quantidade que voce deseja gastar:");
    int money= sc.nextInt();

    double total= money/gasolina;
    System.out.print(total);

    }
}
