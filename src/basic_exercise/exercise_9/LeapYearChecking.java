package basic_exercise.exercise_9;

public class LeapYearChecking {

    public void CheckLeapYear(int year){
        boolean isLeapYear = false;
        if(year % 4 == 0){
            if(year % 100 != 0){
                isLeapYear = true;
            }else {
                if(year % 400 == 0) isLeapYear = true;
            }
        }
        if (isLeapYear){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }
    }
}
