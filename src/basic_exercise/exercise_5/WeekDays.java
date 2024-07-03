package basic_exercise.exercise_5;

public class WeekDays {

    public String GetWeekDay(int day)
    {
        return switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Undefined";
        };
    }
}
