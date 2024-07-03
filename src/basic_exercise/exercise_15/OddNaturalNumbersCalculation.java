package basic_exercise.exercise_15;

public class OddNaturalNumbersCalculation {

    /*public void SumOddNaturalNumbers(int n){
        int result = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if(i < 2){
                result = result + i;
            }else {
                result = result + 2;
            }
            System.out.println(result);
            sum += result;
        }
        System.out.println("The Sum of odd Natural Number upto " + n + " terms is: " + sum);
    }*/

    public void SumOddNaturalNumbers(int n){
        int i = n;
        int result = -1;
        int sum = 0;
        do {
            result = result + 2;
            System.out.println(result);
            i--;
        } while (i > 0);
    }

}
