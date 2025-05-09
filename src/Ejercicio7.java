import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("La suma total es: " +sumarDe1aN(5));
    }

    public static int sumarDe1aN(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sumarDe1aN(num - 1);
    }
}
