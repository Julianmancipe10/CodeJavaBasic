package guia2;
import java.io.IOException;
import java.io.DataInputStream;

public class ejercice1 {

    public static void main(String[] args) throws IOException {
        DataInputStream entrada = new DataInputStream(System.in);
        
        System.out.print("Ingrese el primer numero a sumar: ");
        int num1 = Integer.parseInt(entrada.readLine());
        
        System.out.print("Ingrese el segundo numero a sumar: ");
        int num2 = Integer.parseInt(entrada.readLine());
        
        int result = num1 + num2;
        System.out.println("La suma entre los dos valores ingresados es: " + result);
    }
}

