import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------------|");

        System.out.print("Enter your bill here ($): ");
        double initialBill = scan.nextDouble();
        initialBill = Math.round(initialBill * 100.00) / 100.00;
        System.out.println("-----------------------------------------|");

        System.out.print("Enter your tip percentage here (%): ");
        int tipPercent = scan.nextInt();
        System.out.println("-----------------------------------------|");

        System.out.print("Enter the number of people here: ");
        int numPeople = scan.nextInt();
        System.out.println("-----------------------------------------|");

        double totalBill = initialBill+(initialBill*0.01*tipPercent);
        totalBill = Math.round(totalBill * 100.00) / 100.00;

        System.out.println(totalBill);
    }
}