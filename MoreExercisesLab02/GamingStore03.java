import java.util.Scanner;

public class GamingStore03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());

       double OutFall4 = 39.99;
       double CSOG = 15.99;
       double ZplinterZell = 19.99;
       double Honored2 = 59.99;
       double RoverWatch =29.99;
       double RoverWatchOriginsEdition = 39.99;

       String gameName = scanner.nextLine();
       double spentMoney = 0;
       while (!gameName.equals("Game Time")) {
           double price = 0;

           if (gameName.equals("OutFall 4")) {
               price = OutFall4;
               if (balance >= OutFall4) {
                   balance = balance - price;
                   spentMoney = spentMoney + price;
                   System.out.println("Bought OutFall 4");
               } else {
                   price = 0;
                   System.out.println("Too Expensive");
               }
           } else if (gameName.equals("CS: OG")){
               price = CSOG;
               if (balance >= CSOG) {
                   balance = balance - price;
                   spentMoney = spentMoney + price;
                   System.out.println("Bought CS: OG");
               }else {
                   price = 0;
                   System.out.println("Too Expensive");
               }
           }else if (gameName.equals("Zplinter Zell")){
               price = ZplinterZell;
               if (balance >=ZplinterZell) {
                   balance = balance - ZplinterZell;
                   spentMoney = spentMoney + price;
                   System.out.println("Bought Zplinter Zell");
               }else {
                   price = 0;
                   System.out.println("Too Expensive");
               }
           }else if (gameName.equals("Honored 2")){
               price = Honored2;
               if(balance >= Honored2) {
                   balance = balance - price;
                   spentMoney = spentMoney + Honored2;
                   System.out.println("Bought Honored 2");
               }else {
                   price = 0;
                   System.out.println("Too Expensive");
               }
           }else if (gameName.equals("RoverWatch")){
               price = RoverWatch;
               if (balance >= RoverWatch) {
                   balance = balance - price;
                   spentMoney = spentMoney + price;
                   System.out.println("Bought RoverWatch");
               }else {
                   price = 0;
                   System.out.println("Too Expensive");
               }
           }else if (gameName.equals("RoverWatch Origins Edition")){
               price = RoverWatchOriginsEdition;
               if(balance >=RoverWatchOriginsEdition) {
                   balance = balance - price;
                   spentMoney = spentMoney + price;
                   System.out.println("Bought RoverWatch Origins Edition");
               }else {
                   price = 0;
                   System.out.println("Too Expensive");
               }
           } else {
               System.out.println("Not Found");
           }
           if (balance == 0) {
               break;
           }
           gameName = scanner.nextLine();
       }
       if (balance == 0){
           System.out.println("Out of money!");
       }else {
           System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentMoney, balance);
       }
    }
}
