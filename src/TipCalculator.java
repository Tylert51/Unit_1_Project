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
        System.out.println("Your tip amount is $" + round(totalTip));

        System.out.println("Your total bill with the tip is $" + round(billWithTip));

        if (numPeople == 1) {
            System.out.println("The tip per person (" + numPeople + " person) is $" + round(tipPerPerson));
        }else{
            System.out.println("The tip per person (" + numPeople + " people) is $" + round(tipPerPerson));
        }

        System.out.println("The total per person is $" + round(totalPerPerson));

    }

    public static String round(double num) {           //procedure for rounding
        return String.format("%.2f", num);
        //the 2f means that you want 2 decimals places after the decimal

    }
}
