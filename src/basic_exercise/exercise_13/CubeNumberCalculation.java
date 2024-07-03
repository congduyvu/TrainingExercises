package basic_exercise.exercise_13;

public class CubeNumberCalculation {

    public void CubeNumber(int c)
    {
        if (c <= 0){
            System.out.println("Undefined");
        }
        for (int i = 1; i <= c ; i++){
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + Math.pow(i, 3));
        }
    }
}
