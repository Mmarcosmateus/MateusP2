
import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite um valor:");
            int num= sc.nextInt();
            double duo = num*2;
            double trio = num*3;
            System.out.println(duo);
            System.out.println(trio);
        


            sc.close();
    }
}