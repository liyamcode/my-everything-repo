import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double investment, years, interestRate, finalAmount;

        //asks user for investment amount 
        System.out.print("Investment: ");
        investment = input.nextDouble();

        //asks user for number of years
        System.out.print("Years: ");
        years = input.nextDouble();

        //asks user for the interest rate
        System.out.print("Interest rate: ");
        interestRate = input.nextDouble();

        //does the math to find out the final amount
        finalAmount = (1 + interestRate * years);
        finalAmount = (finalAmount * investment);
        
        //prints out the final amount
        System.out.print("FinalAmount: " + finalAmount);
        
    }
}