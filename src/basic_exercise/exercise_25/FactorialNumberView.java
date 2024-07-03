package basic_exercise.exercise_25;

public class FactorialNumberView {

    public int CalculateFactorialPositiveNumber(int n)
    {
        if(n == 0){
            return n;
        }else if (n == 1){
            return n;
        }else {
            return n * CalculateFactorialPositiveNumber(n-1);
        }
    }
}
