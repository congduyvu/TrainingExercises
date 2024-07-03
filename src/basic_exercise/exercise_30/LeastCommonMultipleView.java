package basic_exercise.exercise_30;

import java.util.ArrayList;

public class LeastCommonMultipleView {

    public void GetLeastCommonMultiple(int a, int b)
    {
        int leastCommonMultiple = (a*b) / FindGreatestCommonDivisor(a,b);
        System.out.println(leastCommonMultiple);
    }

    public int FindGreatestCommonDivisor(int a, int b)
    {
        ArrayList<Integer> greatestCommonDivisorA = new ArrayList<Integer>();
        for (int i = 1; i <= a; i++){
            if(a%i==0){
                greatestCommonDivisorA.add(i);
            }
        }
        ArrayList<Integer> greatestCommonDivisorB = new ArrayList<Integer>();
        for (int i = 1; i <= a; i++){
            if(b%i==0){
                greatestCommonDivisorB.add(i);
            }
        }

        ArrayList<Integer> greatestCommonDivisor = new ArrayList<Integer>();

        for(int i = 0; i < greatestCommonDivisorA.size(); i++){
            for (int j = 0; j < greatestCommonDivisorB.size(); j++){
                if(greatestCommonDivisorA.get(i) == greatestCommonDivisorB.get(j)){
                    greatestCommonDivisor.add(greatestCommonDivisorA.get(i));
                }
            }
        }

        return greatestCommonDivisor.get((greatestCommonDivisor.size()) - 1);
    }
}
