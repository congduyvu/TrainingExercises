package basic_exercise.exercise_28;

public class WholeFractionalPartsView {

    public int GetWholePartOfNumber(double number)
    {
        int result = (int) number;
        return result;
    }

    public double GetFractionalPartOfNumber(double number)
    {
        double result = number - (int) number;
        return result;
    }

    public void GetWholeAndFractionalPartOfNumber(double number)
    {
        System.out.println(GetFractionalPartOfNumber(number));
        System.out.println(GetWholePartOfNumber(number));
    }
}
