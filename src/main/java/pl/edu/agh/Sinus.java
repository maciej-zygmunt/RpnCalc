package pl.edu.agh;

import java.util.Stack;

public class Sinus implements Operator {
    @Override
    public String getSymbol() {
        return "SIN";
    }

    @Override
    public double run(Stack<Double> stack) {
        return  Math.sin(stack.pop());
    }
}
