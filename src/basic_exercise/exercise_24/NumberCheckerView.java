package basic_exercise.exercise_24;

public class NumberCheckerView {

    public void CheckEqualNumbers(int a, int b, int c)
    {
        if(a == b && a == c){
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }

}
