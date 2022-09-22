import java.util.Scanner;

public class SortNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());

        int biggest = 0;
        int medium = 0;
        int smaller = 0;

        if (numOne > numTwo && numOne > numThree){
            biggest = numOne;
            if (numTwo > numThree){
                medium = numTwo;
                smaller = numThree;
            }else {
                medium = numThree;
                smaller = numTwo;
            }
        } else if (numTwo > numOne && numTwo > numThree){
            biggest = numTwo;
            if (numOne > numThree) {
                medium = numOne;
                smaller = numThree;
            }else {
                medium = numThree;
                smaller = numOne;
            }
        }else if ( numThree > numOne && numThree > numTwo){
            biggest = numThree;
            if(numOne > numTwo){
                medium = numOne;
                smaller = numTwo;
            }else {
                medium = numTwo;
                smaller = numOne;
            }
        }
        System.out.printf("%d%n%d%n%d",biggest,medium,smaller);
    }
}
