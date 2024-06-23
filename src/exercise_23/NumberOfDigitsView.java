package exercise_23;

public class NumberOfDigitsView {

    public void CountNumberOfDigits(long n)
    {
        long numberOfDigits = 0;
        String number = Long.toString(n);
        if(n > 10_000_000_000L){
            System.out.println("Please enter number less than ten billion");
        }else {
            numberOfDigits = number.length();
            System.out.println(numberOfDigits);
        }
    }
}
