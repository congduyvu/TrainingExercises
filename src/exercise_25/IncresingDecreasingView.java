package exercise_25;

public class IncresingDecreasingView {

    public void CheckIncreasingDecreasing(int a, int b, int c)
    {
        if(a > b)
        {
            if(b > c){
                System.out.println("Decreasing order");
            }else {
                System.out.println("Neither increasing or decreasing order");
            }
        }else if(a < b){
            if(a < c){
                System.out.println("Increasing order");
            }else {
                System.out.println("Neither increasing or decreasing order");
            }
        }else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
