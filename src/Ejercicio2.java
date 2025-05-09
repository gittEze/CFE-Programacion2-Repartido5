import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int array [] = {16,5,2,7,2,9};

        mayor(array);
    }

    public static void mayor(int array[]) {
        int mayorNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayorNum) {
                mayorNum = array[i];
            }
        }
        System.out.println("El numero mayor es " + mayorNum);
    }
}