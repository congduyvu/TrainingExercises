package basic_exercise.exercise_7;

public class GetNumberOfDaysInMonth {

    // year evenly 4 -> year not evenly 100 -> leap year
    // year evenly 4 -> year evenly 100 -> year evenly 400 -> leap year
    // year not evenly 4 -> not leap year
    // year evenly 4 -> year evenly 100 -> year not evenly 400 -> not leap year

    public void GetNumberOfDays(int year, int month){
        boolean isLeapYear = false;
        if(year % 4 == 0){
            if(year % 100 != 0){
                isLeapYear = true;
            }else {
                if(year % 400 == 0) isLeapYear = true;
            }
        }
        int day = 0;
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> day = 31;
            case 2 -> {
                if(!isLeapYear){
                        day = 28;
                    }else {
                        day = 29;
                    }
            }
            case 4, 6, 9, 11 -> day = 30;
            default -> System.out.println("Undefined");
        }
        System.out.println(day);
    }
}
