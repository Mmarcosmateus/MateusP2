import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Digite sua idade:");
        int idade=sc.nextInt();
        if(idade>=16){
            System.out.print("voce pode votar");
    }
        else{
            System.out.print("voce não pode votar");
    }


        
      }
}