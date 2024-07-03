package basic_exercise.exercise_14;

public class MultiplicationTableCalculation {

    public void CalculateMultiplication(int n)
    {
        String multiply = "x";
        String equal = "=";
        for (int i = 0; i <= n; i++){
            System.out.println(n + multiply + i + equal + n*i);
        }
    }
}
