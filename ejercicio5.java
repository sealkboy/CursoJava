public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entero");
        int entero = Integer.parseInt(scanner.nextLine());

        System.out.print("Decimal: ");
        double decimal = Double.parseDouble(scanner.nextLine());

        System.out.print("Texto: ");
        String texto = scanner.nextLine();

        System.out.println("Entero: " + entero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Texto: " + texto);

        scanner.close();
    }
}
