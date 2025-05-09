import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar contraseña: ");
        String contra = leer.nextLine();
        System.out.println(contra(contra));

    }

    public static boolean contra(String clave) {
        int largo = clave.length();
        if (largo > 7 && largo < 15) {
            System.out.print("¿Contraseña valida? ");
            return true;
        } else {
            System.out.print("¿Contraseña valida? ");
            return false;
        }
    }
}