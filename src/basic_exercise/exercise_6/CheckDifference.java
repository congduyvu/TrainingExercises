package basic_exercise.exercise_6;

import java.text.DecimalFormat;

public class CheckDifference {

    public void CheckDifferentFloatNumber(float a, float b)
    {
        DecimalFormat decimalFormat = new DecimalFormat(".000" + "$");
        String formatA = decimalFormat.format(a);
        String formatB = decimalFormat.format(b);
        String[] partA = formatA.split("\\.");
        String[] partB = formatB.split("\\.");
        String result = partA[1].equals(partB[1]) ? "They are equal" : "They are different";
        System.out.println(result);
    }
}
