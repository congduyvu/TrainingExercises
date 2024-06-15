package exercise_3;

public class GreatestNumber {

    public void GetGreatestNumber(int a, int b, int c)
    {
        int d = Math.max(a, b);
        int result = Math.max(d, c);
        System.out.println(result);
    }
}
