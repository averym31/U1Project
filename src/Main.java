import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your bill here ($): "); // tells user to input their bill as a double with 2 floating point decimals
        double initialBill = scan.nextDouble();
        initialBill = Math.round(initialBill * 100.00) / 100.00; // tells user to input their bill as a double with 2 floating point decimals
        System.out.print("Enter your tip percentage here (%): ");
        int tipPercent = scan.nextInt();
        System.out.print("Enter the number of people here: "); // tells user to input their bill as a double with 2 floating point decimals
        int numPeople = scan.nextInt();

        double totalTip = initialBill*0.01*tipPercent; // totalTip is determined by the percentage multiplied by the cost of the bill
        totalTip = Math.round(totalTip * 100.00) / 100.00; // rounds the value

        double totalBill = initialBill+totalTip; //totalBill is determined by the cost of the bill plus the total cost of the tips
        totalBill = Math.round(totalBill * 100.00) / 100.00; // rounds the value

        double tipPerson = totalTip/numPeople; // tipPerson is determined by the amount of money in tips each person pays
        tipPerson = Math.round(tipPerson * 100.00) / 100.00; // rounds the value

        double billPerson = totalBill/numPeople; // billPerson is determined by the total amount of money each person pays, including tips
        billPerson = Math.round(billPerson * 100.00) / 100.00; // rounds the value

        //this println statement is to space out the inputs from the outputs
        System.out.println("----------------------------------------");

        /* these last lines print out all the necessary info the code has calculated */
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