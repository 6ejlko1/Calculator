public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(10, 3));
        System.out.println(calc.mult(15, 2));
        System.out.println(calc.pow(12, 2));
    }
}