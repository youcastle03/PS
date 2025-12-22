import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main {

    private static boolean solveAnagrams(String first, String second ) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        
        if(first.length()!=second.length()){
            return false;
        }
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            char c2 = second.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
            map2.put(c2,map2.getOrDefault(c2,0)+1);
        }

        for(char key : map1.keySet()) {
            if(map1.get(key)!=map2.get(key)) {
                return false;
            }
        }
        return true;

        /* -------------------- END OF INSERTION --------------------*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
