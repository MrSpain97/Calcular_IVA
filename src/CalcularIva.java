import java.util.Scanner;

public class CalcularIva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de base: ");
        double base = sc.nextDouble();
        System.out.println("Digite o valor del IVA: ");
        double iva = sc.nextDouble();
        System.out.println(CalcularIva.calcularIva(base, iva));

    }
    public static double calcularIva(double base, double iva) {
        return base * iva;
    }
}
