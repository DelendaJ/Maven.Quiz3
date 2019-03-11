package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] arr = str.toCharArray();
        arr[indexToCapitalize] = Character.toUpperCase(arr[indexToCapitalize]);
        String blah = new String(arr);
        return blah;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        char c = baseString.charAt(indexOfString);
        
        if (c == characterToCheckFor)
            return true;
        else
            return false;

    }




    public static String[] getAllSubStrings(String string) {

        List<String> subsList = new ArrayList<String>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = 1; j <= string.length() - i; j++) {
                String blah = string.substring(i, i + j);
                subsList.add(blah);
            }
        }
        String[] alltheSubs = subsList.toArray(new String[0]);
        return alltheSubs;

    }

    public static Integer getNumberOfSubStrings(String input) {
       return null;
    }
}
