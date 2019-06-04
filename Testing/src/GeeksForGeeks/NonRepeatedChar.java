package GeeksForGeeks;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *
 * @author mithilesh.kumar
 */
public class NonRepeatedChar {

    public static void main(String args[]) {
        String str = "A0BCACABDDFYIO";

        HashMap<Character, Integer> nonRepeated = new LinkedHashMap<>();
        HashMap<Character, Integer> repeated = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {

            
            System.out.println("Now Doing Operation For char:"+str.charAt(i));
            if (repeated.size() > 0) {
                System.out.println("Repeated Char:=>"+repeated);
                if (repeated.containsKey(str.charAt(i))) {
                    continue;

                }
            }

            
            
            if (nonRepeated.size() > 0) {
                if (nonRepeated.containsKey(str.charAt(i))) {
                    repeated.put(str.charAt(i), 0);
                    nonRepeated.remove(str.charAt(i), 0);
                    System.out.println("Non Repeated Char:=>"+nonRepeated);
                    continue;

                }

            }

            
            
            nonRepeated.put(str.charAt(i), 0);
            System.out.println("Non Repeated Char:=>"+nonRepeated);
            
        }
        
        
        
           System.out.println("Final Non Repeated Char:=>"+nonRepeated);
        
    }
}
