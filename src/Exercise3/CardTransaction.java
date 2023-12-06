package Exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class CardTransaction {

    static double income;
    static double expenses;


    public static void getIncomingSum() throws Exception {
        double ReceiptFunds = 0;
        Scanner scan = new Scanner(System.in);
        boolean validInput = false;
        do {
            try {
                System.out.println("--Enter the top-up amount: ");
                ReceiptFunds = scan.nextDouble();
                validate(ReceiptFunds);
                income += ReceiptFunds;
                System.out.println("Result operation: ");
                System.out.println("/you have successfully topped up your account with the amount (UAH): " + ReceiptFunds+ "/");
                System.out.println();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Result operation: ");
                System.out.println("Invalid number format: " + ex.getMessage());
                scan.next();
            } catch (Exception ex) {
                System.out.println("Result operation: ");
                System.out.println(ex.getMessage());
            }
        } while (!validInput);

        CardTransaction.getResultBalance();
    }

    public static void getExpensesSum() throws Exception {
        double Debit = 0;
        Scanner scan2 = new Scanner(System.in);
        boolean validOutput = false;
        do {
            try {
                System.out.println("--Enter the payment amount: ");
                Debit = scan2.nextDouble();
                validate2(Debit);
                expenses += Debit;
                System.out.println("Result operation: ");
                System.out.println("/payment in the amount of " + Debit + " was successful/");
                System.out.println();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Result operation: ");
                System.out.println("Invalid number format: " + ex.getMessage());
                scan2.next();
            } catch (Exception ex) {
                System.out.println("Result operation: ");
                System.out.println(ex.getMessage());
            }
        } while (!validOutput);

        CardTransaction.getResultBalance();
    }

    private static void validate(double ReceiptFunds) throws Exception{
        int max = 500;
        if (ReceiptFunds > max) {
            throw new Exception("The replenishment amount exceeds the limit/day - 500 UAH");
        }
    }

    private static void validate2(double Debit) throws Exception {
        int max = 1000;
        if (Debit>max && Debit > CardBalance.balance){
            throw new Exception("The payment amount exceeds the limit - 1000 UAH/transaction and your card balance " + CardBalance.balance);
        }
        if (Debit > CardBalance.balance) {
            throw new Exception(new StringBuilder("(!) The amount on the card is not enough. Your current balance: ").append(CardBalance.balance).append( " Top up your card balance").toString());
        }
    }

    public static void getResultBalance() {
        CardBalance.balance = income - expenses;
        System.out.println("___________Your current balance (UAH): " + CardBalance.balance);
        System.out.println();

    }

    //________________________________________________________________________________
    public static void main(String[] args) throws Exception {

        CardTransaction.getIncomingSum();
        CardTransaction.getExpensesSum();
        CardTransaction.getIncomingSum();
        CardTransaction.getExpensesSum();


    }
}
