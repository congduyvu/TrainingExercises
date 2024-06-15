package exercise_11;

public class NaturalNumbers {

    public void DisplayTerms(int n){
        int result = 0;
        System.out.println("Input number: " + n);
        for (int i = 1; i <= n; i++){
            System.out.println(i);
            result = result + i;
        }
        System.out.println("The Sum of Natural Number upto n terms : " + result);
    }
}
