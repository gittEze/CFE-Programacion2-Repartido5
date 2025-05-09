import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        pares(5);

    }

    public static boolean pares(int num) {
        if (num %2 == 0) {
            System.out.println("el número " + num + " es par");
            return true;
        } else {
            System.out.println("el número " + num + " es impar");
            return false;
        }
    }

}