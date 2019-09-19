package pl.edu.agh;

import java.util.Stack;

public interface Operator {
     String getSymbol();

     double run(Stack<Double> stack);
}
