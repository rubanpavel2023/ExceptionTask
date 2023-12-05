package Exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CardTransaction {

        private double balance;
        private double income;
        private double expenses;


        public void getIncomingSum() throws Exception {
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
        }

        public void getExpensesSum() throws Exception {
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

        }

        private void validate(double ReceiptFunds) throws Exception {
            int max = 500;
            if (ReceiptFunds > max) {
                throw new Exception("The replenishment amount exceeds the limit/day - 500 UAH");
            }
        }

        private void validate2(double Debit) throws Exception {
            int max = 1000;
            if (Debit>max && Debit > balance){
                throw new Exception("The payment amount exceeds the limit - 1000 UAH/transaction and your card balance " + getBalance());
            }
            if (Debit > balance) {
                throw new Exception(new StringBuilder("(!) The amount on the card is not enough. Your current balance: ").append(getBalance()).append( " Top up your card balance").toString());
            }
        }

        public void getResultBalance() {
            this.balance = income - expenses;
            System.out.println("___________Your current balance (UAH): " + this.balance);
            System.out.println();

        }

        public double getBalance() {
            return balance;
        }
//________________________________________________________________________________
    public static void main(String[] args) throws Exception {
        CardTransaction Alex = new CardTransaction();
        Alex.getIncomingSum();
        Alex.getResultBalance();

        Alex.getExpensesSum();
        Alex.getResultBalance();

        Alex.getIncomingSum();
        Alex.getResultBalance();

        Alex.getExpensesSum();
        Alex.getResultBalance();

    }
    }

