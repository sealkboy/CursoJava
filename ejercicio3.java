public class ejercicio3 {
    public static void main(String[] args) {
        int a = 3; 
        int b = 87; 

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
