package exercise_4;

public class PositiveNegativeNumber {

    public String GetPositiveNegativeNumber(float number)
    {
        String result = "positive";
        if(number == 0){
            result = "zero";
            return result;
        }
        if (number > 0 && number < 1){
            result = "small ".concat(result);
            return result;
        }
        if (number > 1 && number < 1_000_000){
            return result;
        }
        if(number > 1_000_000){
            result = "large ".concat(result);
            return result;
        }else {
            result = "negative";
            return result;
        }
    }
}
