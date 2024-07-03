package basic_exercise.exercise_2;

public class QuadraticEquationsFormula {

    //ax2 + bx + c = 0
    //formula
    //x= (-b + sqrt(b*b-4*a*c))/(2*a)
    //x= (-b - sqrt(b*b-4*a*c))/(2*a)

    public void QuadraticEquationsCalculation(int a, int b, int c)
    {
        if(a == 0 && b == 0 && c==0){
            System.out.println("Undefined");
        }
        if(a == 0 && b == 0 && c != 0){
            System.out.println("Undefined");
        }
        if(a == 0){
            double result = (double) -c/b;
            System.out.println(result);
        }
        if(a != 0){
            double firstResult = (double) ((-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a));
            double secondResult = (double) ((-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a));
            System.out.println(firstResult + " and " + secondResult);
        }
    }
}
