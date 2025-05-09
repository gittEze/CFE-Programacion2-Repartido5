import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        de1aN(5);
    }

    private static void de1aN(int num) {
        if (num == 0) {
            return;
        }
        de1aN(num - 1);
        System.out.print(num + " ");
    }
}