package exercise_26;

public class SumOfNumbersView {

    public int CalculateSumOfNumbers(int n)
    {
        if(n == 0){
            return n;
        } else if (n == 1) {
            return n;
        }else {
            return n + CalculateSumOfNumbers(n -1);
        }
    }
}
