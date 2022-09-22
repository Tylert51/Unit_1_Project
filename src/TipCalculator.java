import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //storing values of user input

        System.out.println();
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
        System.out.print("Your tip amount is $");
        round(totalTip);
        System.out.println();

        System.out.print("Your total bill with the tip is $");
        round(billWithTip);
        System.out.println();

        if (numPeople == 1) {
            System.out.print("The tip per person (" + numPeople + " person) is $");
        }else{
            System.out.print("The tip per person (" + numPeople + " people) is $");
        }
        round(tipPerPerson);
        System.out.println();

        System.out.print("The total per person is $");
        round(totalPerPerson);
        System.out.println();

    }

    public static void round(double num) {           //procedure for rounding
        System.out.printf(("%.2f"), num);    //num is the number you want to round
        //the 2f means that you want 2 decimals places after the decimal

    }
}
