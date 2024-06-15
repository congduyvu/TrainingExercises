package exercise_16;

public class AngleTriangleView {

    public void AssembleAngleTriangle(int n)
    {
        String result = "";
        for (int i = 1; i <= n; i++){
            result = result.concat(Integer.toString(i));
            System.out.println(result);
        }
    }
}
