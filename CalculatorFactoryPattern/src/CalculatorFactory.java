public class CalculatorFactory {

    public Calculator createCalculator(String type) {
        switch(type) {
            case "Basic" : return new BasicCalculator();
            default: throw new IllegalArgumentException("Unknow Calculator of type: " + type);
        }
    }
}
