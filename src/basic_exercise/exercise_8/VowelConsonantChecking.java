package basic_exercise.exercise_8;

public class VowelConsonantChecking {

    public void CheckVowelConsonant(String character)
    {
        if(character.length() != 1){
            System.out.println("Your input is not a character");
        }else {
            char key = character.charAt(0);
            if(!Character.isLetter(key)){
                System.out.println("Your input is not a character");
            }else{
                if(IsVowel(key)){
                    System.out.println("Vowel");
                }else {
                    System.out.println("Consonant");
                }
            }
        }

    }

    public boolean IsVowel(char key)
    {
        key = Character.toLowerCase(key);
        return key == 'e' || key == 'u' || key == 'o' || key == 'a' || key == 'i';
    }
}
