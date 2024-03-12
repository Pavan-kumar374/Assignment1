import java.util.*;
public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        int index = 7; // Index of the character to be replaced
        char replacementChar = 'X'; // Character to replace with
        
        String modifiedString = replaceCharAtIndex(originalString, index, replacementChar);
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
    
    public static String replaceCharAtIndex(String str, int index, char replacementChar) {
        if (index < 0 || index >= str.length()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        
        char[] chars = str.toCharArray();
        chars[index] = replacementChar;
        return new String(chars);
    }
}