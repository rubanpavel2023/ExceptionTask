package Exceptions_task;

import Exceptions_task.Exercise3.CardTransaction;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercise #1");
        Exercise1.getNumber();
        System.out.println("________________________");

        System.out.println("Exercise #2");
        double[] Prices = {234.34, 199.24, 250.08, 240.50, 212.14};
        System.out.println(Exercise2.getPrice(Prices));
        System.out.println("_________________________");

        System.out.println("Exercise #2| vers2");
        double[] Prices2 = {234.34, 199.24, 250.08, 240.50, 212.14};
        System.out.println(Exercise2.getPrice(Prices2));
        System.out.println("_________________________");

        System.out.println("Exercise #3");
        CardTransaction.getIncomingSum();
        CardTransaction.getExpensesSum();
        CardTransaction.getIncomingSum();
        CardTransaction.getExpensesSum();

        System.out.println("Exercise #4");
        Exercise4.tempControl();
    }


}
