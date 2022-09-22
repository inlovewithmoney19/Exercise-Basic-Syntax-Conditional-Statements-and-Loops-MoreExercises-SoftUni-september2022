import java.util.Scanner;

public class EnglishNameOfTheLastDigit02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

//        switch (number % 10) {
//            case 1 -> System.out.println("one");
//            case 2 -> System.out.println("two");
//            case 3 -> System.out.println("three");
//            case 4 -> System.out.println("four");
//            case 5 -> System.out.println("five");
//            case 6 -> System.out.println("six");
//            case 7 -> System.out.println("seven");
//            case 8 -> System.out.println("eight");
//            case 9 -> System.out.println("nine");
//            case 0 -> System.out.println("zero");
//        }
        if (number % 10 == 1){
            System.out.println("one");
        }else if (number % 10 == 2){
            System.out.println("two");
        }else if (number % 10 == 3){
            System.out.println("three");
        }else if (number % 10 == 4){
            System.out.println("four");
        }else if (number % 10 == 5){
            System.out.println("five");
        }else if (number % 10 == 6){
            System.out.println("six");
        }else if (number % 10 == 7){
            System.out.println("seven");
        }else if (number % 10 == 8){
            System.out.println("eight");
        }else if (number % 10 == 9){
            System.out.println("nine");
        }else if (number % 10 == 0){
            System.out.println("zero");
        }
    }
}
