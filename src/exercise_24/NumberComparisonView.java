package exercise_24;

public class NumberComparisonView {

    public void CompareNumbers(int a, int b, int c)
    {
        if (a == b && a == c && c == b)
        {
            System.out.println("All numbers are equal");
        }else if(a != b && a != c && c != b){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }
}
