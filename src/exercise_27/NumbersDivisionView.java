package exercise_27;

public class NumbersDivisionView {

    public void DivideNumbersAndRoundUp(float a, float b)
    {
        if(b == 0){
            System.out.println("Division by zero is not allowed.");
        }else {
            System.out.println(Math.round(a/b));
        }
    }
}
