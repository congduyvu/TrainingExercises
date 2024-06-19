package exercise_21;

public class DiamondPattern {

    public void AssembleDiamondPattern()
    {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(" ");;
            }
            for (int k = 1; k <= i; k++) {
                if(k % 2 != 0){
                    System.out.print("*");
                }
                if(k > 2){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
