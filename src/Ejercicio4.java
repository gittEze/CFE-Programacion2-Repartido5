import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        contarImpares(7);

    }

    public static void contarImpares(int num) {
        if (num == 0) {
            return;
        }
        if (num % 2 != 0) {
            System.out.println(num);
        }
        contarImpares(num - 1);
    }
}