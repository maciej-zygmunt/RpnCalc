package pl.edu.agh;

import java.util.*;

public class Calc {

    private Map<String, Operator> operators = new HashMap<>();

    public Calc(List<Operator> operators) {
        operators.forEach(e -> {
            this.operators.put(e.getSymbol(), e);
        });
    }

    public double calculate(String input) {
        Stack<Double> stack = new Stack<>();
        String[] elements = input.split("[\\s]+");
        for (String element : elements) {
            if (isOperator(element)) {
                Operator op = operators.get(element);
                double res = op.run(stack);
                stack.push(res);
            } else if (isNumber(element)) {
                stack.push(Double.parseDouble(element));
            }
        }
        return stack.pop();
    }

    private boolean isNumber(String source) {
        Scanner scanner = new Scanner(source);
        if (scanner.hasNextDouble()) {
            return true;
        }
        return false;
    }

    private boolean isOperator(String operator) {
        return operators.containsKey(operator);
    }
}
