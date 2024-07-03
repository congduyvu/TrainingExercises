package basic_exercise.exercise_23;

public class NumberOfDigitsCountView {

    public void CountNumber(long n)
    {
        if (n < 0 && n > 10_000_000_000L)
        {
            System.out.println("Input is greater than ten billion");
        }else {
            int number = 0;
            String numberInString = Long.toString(n);
            for (int i = 0; i < numberInString.length(); i++){
                number = number + 1;
            }
            System.out.println(number);
        }
    }
}
