package pl.edu.agh;

import java.util.List;
import java.util.Stack;

public class ListOfOperators {
    public static List<Operator> CreateList()
    {
        List<Operator> operators= List.of(
                new Sinus(),
                new GenericOperator("COS",s->{ return Math.cos(s.pop());}),
                new GenericOperator("+",s->{ return s.pop()+ s.pop();}),
                new GenericOperator("-",s->{ return -s.pop()+ s.pop();}),
                new GenericOperator("/",s->{ double a=s.pop();double b= s.pop();return a/b;}),
                new GenericOperator("*",s->{ return s.pop()* s.pop();})
        );
        return operators;
    }
}
