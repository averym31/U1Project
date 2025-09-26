import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// tells user to input their bill as a double with 2 floating point decimals
        System.out.print("Enter your bill here ($): ");
        double initialBill = scan.nextDouble();
        initialBill = Math.round(initialBill * 100.00) / 100.00;
// tells user to input their tip percentage as an integer
        System.out.print("Enter your tip percentage here (%): ");
        int tipPercent = scan.nextInt();
// tells user to input the number of people paying as an integer
        System.out.print("Enter the number of people here: ");
        int numPeople = scan.nextInt();
// totalTip is determined by the percentage multiplied by the cost of the bill
        double totalTip = initialBill*0.01*tipPercent;
        totalTip = Math.round(totalTip * 100.00) / 100.00;
        //totalBill is determined by the cost of the bill plus the total cost of the tips
        double totalBill = initialBill+totalTip;
        totalBill = Math.round(totalBill * 100.00) / 100.00;
        // tipPerson is determined by the amount of money in tips each person pays
        double tipPerson = totalTip/numPeople;
        tipPerson = Math.round(tipPerson * 100.00) / 100.00;
        // billPerson is determined by the total amount of money each person pays, including tips
        double billPerson = totalBill/numPeople;
        billPerson = Math.round(billPerson * 100.00) / 100.00;

        //this println statement is just for design purposes
        System.out.println("----------------------------------------");

        //these last lines just print out all the necessary info the code has calculated
        System.out.print("Total tip amount: $");
        System.out.printf("%.2f%n", totalTip);
        System.out.print("Total bill cost: $");
        System.out.printf("%.2f%n", totalBill);
        System.out.print("Tip per person: $");
        System.out.printf("%.2f%n", tipPerson);
        System.out.print("Total bill per person: $");
        System.out.printf("%.2f%n", billPerson);
    }
}