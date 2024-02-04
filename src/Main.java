public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        // Ошибка в делении на 0, как вариант при делении на 0, выводить результат 0, исправлено в классе Calculator
        calc.println.accept(c);
    }
}
