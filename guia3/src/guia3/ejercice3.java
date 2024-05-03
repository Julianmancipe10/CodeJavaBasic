package guia3;
import java.util.Scanner;
import java.io.IOException;

public class ejercice3 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int x = scanner.nextInt();

        if (x < 0) {
            x = x * -1;
        }

        System.out.println("El número es: " + x);

        scanner.close(); 
    }
}


  