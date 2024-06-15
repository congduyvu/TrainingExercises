package exercise_12;

import java.util.ArrayList;

public class SumAndAverageCalculation {

    public void DisplayCalculation(int a, int b, int c, int d, int e)
    {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(Integer.toString(a));
        numbers.add(Integer.toString(b));
        numbers.add(Integer.toString(c));
        numbers.add(Integer.toString(d));
        numbers.add(Integer.toString(e));
        System.out.println("Input the 5 numbers :");
        for (String number : numbers){
            System.out.println(number);
        }
        System.out.println("The sum of 5 no is : " + SumCalculation(a, b, c, d, e));
        System.out.println("The Average of 5 no is : " + AverageCalculation(a, b, c, d, e));
    }

    public int SumCalculation(int a, int b, int c, int d, int e)
    {
        return a + b + c + d + e;
    }

    public double AverageCalculation(int a, int b, int c, int d, int e)
    {
        return (double) (a + b + c + d + e) / 5;
    }
}
