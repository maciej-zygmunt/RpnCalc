package pl.edu.agh;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalcTest
{

    @Test
    public void calcTest()
    {
        String input="5 1 2  + 4 * + 3 -";
        double actual=new Calc(ListOfOperators.CreateList()).calculate(input);
        Assert.assertEquals(14,actual,0.01);
        System.out.println("Success");
    }
    @Test
    public void calcTestPlus()
    {
        String input="2 2 + ";
        double actual=new Calc(ListOfOperators.CreateList()).calculate(input);
        Assert.assertEquals(4,actual,0.01);
        System.out.println("Success");
    }

    @Test
    public void calcTestSin()
    {
        String input="0 SIN ";
        double actual=new Calc(ListOfOperators.CreateList()).calculate(input);
        Assert.assertEquals(0,actual,0.01);
        System.out.println("Success");
    }
    @Test
    public void calcTestCos()
    {
        String input="0 COS ";
        double actual=new Calc(ListOfOperators.CreateList()).calculate(input);
        Assert.assertEquals(1,actual,0.01);
        System.out.println("Success");
    }
}
