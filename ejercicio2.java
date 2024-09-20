public class ejercicio2 {
    public static void main(String[] args) {
        int a = 42;
        int b = 10;

        System.out.println("a =" + a);
        System.out.println("b =" + b);

        a = a + b; 
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
} 
}