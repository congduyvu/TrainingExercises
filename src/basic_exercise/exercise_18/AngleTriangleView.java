package basic_exercise.exercise_18;

public class AngleTriangleView {

    public void AssembleAngleTriangle(int n){
        int number = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1 ; j <= i; j++){
                System.out.print(number + "");
                number++;
            }
            System.out.println();
        }
    }
}
