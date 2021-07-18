import java.util.*;

public class task {

    public static void main(String[] args) {
        String s = "Spd-University";
        String result = s.toUpperCase();
        System.out.println(result);

        Set<Character> evenCharacters = new HashSet<>();
        Set<Character> oddCharacters = new HashSet<>();

        for (char ch : result.toCharArray()) {
            if (ch % 2 == 0) {
                evenCharacters.add(ch);
            } else {
                oddCharacters.add(ch);
            }
        }

        int evenSum = getSum(evenCharacters);
        int oddSum = getSum(oddCharacters);

        System.out.println("Sum of even symbols " + evenSum);
        System.out.println("Sum of odd symbols " + oddSum);
        System.out.println("Result of substraction  " + (evenSum - oddSum));

        System.out.println("The characters and numbers even group: "+charactersToString(evenCharacters));
        System.out.println("The characters and numbers odd group: "+charactersToString(oddCharacters));
    }

    private static String charactersToString(Set<Character> characters){
        String result = "";
        for (Character ch : characters) {
            result+=ch + "=" + (int) ch + "; ";
        }
        return result;
    }

    private static int getSum(Set<Character> charactersToSum) {
        return charactersToSum.stream().mapToInt(ch -> ch).sum();
    }
}
