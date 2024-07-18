
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class WordChecker {
    
    public static void main(String[] args) {
        System.out.println("Please enter the statement");
        Scanner scan = new Scanner(System.in);
        String stmt = scan.nextLine();

        String[] wordArray = stmt.split(" ");
        Map<String,Integer> mp= new HashMap<String,Integer>();

        for (String word: wordArray) {
            if (mp.containsKey(word)) {
                mp.put(word, mp.get(word) + 1);
            } else {
                mp.put(word, 1);
            }
        }

        for (String key :mp.keySet()) {
            System.out.printf("%s:%d\n",key,mp.get(key));
        }
    }

}
