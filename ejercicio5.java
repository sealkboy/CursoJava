import java.util.Scanner;

// entero, decimal, cadena de texto
public class ejercicio5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido, " + nombre);

        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Usted tiene " + edad + " años.");

        System.out.println("Introduce tu peso: " );
        double peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("Tu peso es : " + peso);

        sc.close();

    }
}
