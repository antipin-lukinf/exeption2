public class Zd2 {
    public static void main(String[] args) {
        try {
            Double d = 0.0;
            Double catchedRes1 = 8 / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
