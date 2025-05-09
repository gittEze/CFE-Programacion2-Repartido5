import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        mayor(12,18);

    }

    public static void mayor(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " es mayor");
        } else if (num2 > num1) {
            System.out.println(num2 + " es mayor");
        } else if (num1 == num2) {
            System.out.println(num1 + " es mayor");
        } return;
    }
}