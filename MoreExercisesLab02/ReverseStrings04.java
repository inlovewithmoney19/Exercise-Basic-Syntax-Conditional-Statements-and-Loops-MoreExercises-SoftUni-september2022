import java.util.Scanner;

public class ReverseStrings04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String reverseText = "";
        for (int position = text.length() - 1; position >= 0 ; position--) {
            char currentSymbol = text.charAt(position) ;
            reverseText = reverseText + currentSymbol;
        }
        System.out.println(reverseText);
    }
}
