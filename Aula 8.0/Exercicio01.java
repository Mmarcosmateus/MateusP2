public class Exercicio01 {

   
    public static double calcularHipotenusa(double a, double b) {
        double resultado = Math.sqrt(a * a + b * b);
        return resultado;
    }

    public static void main(String[] args) {
        double a = 3;
        double b = 4;

        double hipotenusa = calcularHipotenusa(a, b);

        System.out.println("Hipotenusa: " + hipotenusa);
    }
}
