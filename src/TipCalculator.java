import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //initializing variables or storing values


        System.out.print("Enter your total bill: ");
        double totalBill = s.nextDouble();
        System.out.print("Enter your tip percentage: ");
        double tipPercent = s.nextDouble();
        System.out.print("Enter the amount of people in your party: ");
        int numPeople = s.nextInt();

        //calculations

        double tipDecimal = tipPercent/100;
        double totalTip = totalBill * tipDecimal;
        double billWithTip = totalBill + totalTip;
        double tipPerPerson = totalTip/numPeople;
        double totalPerPerson = billWithTip/numPeople;

        //display

        System.out.println();
        System.out.println("Your tip amount is $" + totalTip);
        System.out.println("Your total bill with the tip is $" + billWithTip);
        System.out.println("The tip per person is $" + tipPerPerson);
        System.out.println("The total per person is $" + totalPerPerson);


    }


}
