import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int price = 10;
        System.out.print("Informe o a quantidade da compra:");
        double valorunitario= sc.nextDouble();
            double compra= valorunitario*price;
            double discount;

            if(compra>100){
                discount= (compra*0.92);
            System.out.println(discount);
        }
            else{
                System.out.print(compra);
            }
    }
 
}