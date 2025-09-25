import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your bill here ($): ");
        double initialBill = scan.nextDouble();
        initialBill = Math.round(initialBill * 100.00) / 100.00;

        System.out.print("Enter your tip percentage here (%): ");
        int tipPercent = scan.nextInt();

        System.out.print("Enter the number of people here: ");
        int numPeople = scan.nextInt();

        double totalTip = initialBill*0.01*tipPercent;
        totalTip = Math.round(totalTip * 100.00) / 100.00;
        double totalBill = initialBill+totalTip;
        totalBill = Math.round(totalBill * 100.00) / 100.00;
        double tipPerson = totalTip/numPeople;
        tipPerson = Math.round(tipPerson * 100.00) / 100.00;
        double billPerson = totalBill/numPeople;
        billPerson = Math.round(billPerson * 100.00) / 100.00;

        System.out.println("----------------------------------------");

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