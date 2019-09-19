package pl.edu.agh;

import java.util.Stack;
import java.util.function.Function;
;

public class GenericOperator implements Operator {
    private final String symbol;
    private final Function<Stack<Double>,Double> run;

    public GenericOperator(String symbol, Function<Stack<Double>,Double> run) {
        this.symbol = symbol;
        this.run = run;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public double run(Stack<Double> stack) {
        return this.run.apply(stack);
    }
}
