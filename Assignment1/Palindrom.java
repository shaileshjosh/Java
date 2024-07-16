import java.util.Scanner;

public class Palindrom {

    boolean checkPalindrom(String inputString) {
        String reversedString = "";
            for (int j = inputString.length()-1; j >= 0; j--) {
                System.out.println(reversedString);
               reversedString = reversedString + inputString.charAt(j) ;
            }
            return reversedString.equals(inputString);
    }

    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       
        Palindrom p = new Palindrom();
        Boolean result = p.checkPalindrom(str);

        if (result) {
            System.out.println("it is palindrom");
        } else {
            System.out.println("it is not palindrom");
        }
    }

}
