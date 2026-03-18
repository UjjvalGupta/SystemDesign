import java.util.HashMap;
import java.util.Map;

public class BasicCalculator implements Calculator{

    private Map<String,Operator> operatorMap;

    BasicCalculator(){
        operatorMap = new HashMap<>();
        operatorMap.put("+", new AdditionOperator());
        operatorMap.put("-", new SubtractionOperator());
        operatorMap.put("*", new MultiplicationOperator());

    }

    @Override
    public void calculate(double a, double b, String operator) {
        Operator operator1 = operatorMap.get(operator);
        if(operator1 == null) {
            System.out.println("Operation:" + operator + " is not supported by basic calculator");
            return;
        }
        double ans = operator1.operate(a,b);
        System.out.println("Answer is : " + ans);
    }

    @Override
    public void addOperation(String operatorType, Operator operator) {
        operatorMap.put(operatorType, operator);
    }
}
