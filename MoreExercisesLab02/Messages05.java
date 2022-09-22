package BasicSyntax;

import java.util.Scanner;

public class Messages05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int size = input.length();
            char currentNum = input.charAt(0);
            if(currentNum == '2') {
                if(size == 1){
                    System.out.print("a");
                } else if(size == 2){
                    System.out.print("b");
                } else if (size == 3){
                    System.out.print("c");
                }
            } else if (currentNum == '3'){
                if(size == 1){
                    System.out.print("d");
                } else if(size == 2){
                    System.out.print("e");
                } else if (size == 3){
                    System.out.print("f");
                }
            } else if (currentNum == '4'){
                if(size == 1){
                    System.out.print("g");
                } else if(size == 2){
                    System.out.print("h");
                } else if (size == 3){
                    System.out.print("i");
                }
            } else if (currentNum == '5'){
                if(size == 1){
                    System.out.print("j");
                } else if(size == 2){
                    System.out.print("k");
                } else if (size == 3){
                    System.out.print("l");
                }
            } else if (currentNum == '6'){
                if(size == 1){
                    System.out.print("m");
                } else if(size == 2){
                    System.out.print("n");
                } else if (size == 3){
                    System.out.print("o");
                }
            }else if (currentNum == '7'){
                if(size == 1){
                    System.out.print("p");
                } else if(size == 2){
                    System.out.print("q");
                } else if (size == 3){
                    System.out.print("r");
                } else if (size == 4){
                    System.out.print("s");
                }
            } else if (currentNum == '8'){
                if(size == 1){
                    System.out.print("t");
                } else if(size == 2){
                    System.out.print("u");
                } else if (size == 3){
                    System.out.print("v");
                }
            } else if (currentNum == '9'){
                if(size == 1){
                    System.out.print("w");
                } else if(size == 2){
                    System.out.print("x");
                } else if (size == 3){
                    System.out.print("y");
                } else if(size == 4){
                    System.out.print('z');
                }
            } else if (currentNum == '0'){
                System.out.print(" ");
            }
        }
    }
}