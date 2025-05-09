import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println(factorial(5));
    }

    public static int factorial(int num) {
        if (num == 1) {
            return num;
        }
        return num * factorial(num - 1);
    }

}
