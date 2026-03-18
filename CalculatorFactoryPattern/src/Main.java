//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator basicCaluculator = new CalculatorFactory().createCalculator("Basic");
        basicCaluculator.calculate(10, 20, "+");
        basicCaluculator.calculate(20, 10, "/");
        basicCaluculator.addOperation("/", new DivisionOperator());
        basicCaluculator.calculate(20, 10, "/");
    }
}