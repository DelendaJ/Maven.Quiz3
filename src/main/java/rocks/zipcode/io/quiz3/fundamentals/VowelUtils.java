package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
       if (word.contains("a") || word.contains("e") || word.contains("i")
               || word.contains("o") || word.contains ("u"))
           return true;
       else
           return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        int i;
        for(i=0; i<word.length();i++){
            switch(word.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return i;
            }
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        if (word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O")
                || word.startsWith("U"))

            return true;
        else
            return false;

    }

    public static Boolean isVowel(Character character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')
            return true;
        else
            return false;
    }
}
