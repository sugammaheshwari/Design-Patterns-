import java.util.HashMap;
import java.util.Map;
public class Calculator {
    private static Calculator instance;

    private Map<String, CalculationStrategy> calculationStrategies;

    private Calculator() {
        calculationStrategies = new HashMap<>();
    }

    public void addCalculationStrategy(String name, CalculationStrategy strategy) {
        calculationStrategies.put(name, strategy);
    }

    public static Calculator getInstance() {
        if (instance == null)
            instance = new Calculator();
        return instance;
    }

    public Expression calculate(String name, Expression expression) {
        return calculationStrategies.get(name).calculate(expression);
    }
}
