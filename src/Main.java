import Exceptions_task.Exercise1;
import Exceptions_task.Exercise2;
import Exceptions_task.Exercise4;
import Exercise3.CardTransaction;

import java.util.InputMismatchException;
import java.util.Scanner;

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
                CardTransaction Dmitry = new CardTransaction();
                Dmitry.getIncomingSum();
                Dmitry.getResultBalance();

                Dmitry.getExpensesSum();
                Dmitry.getResultBalance();

                Dmitry.getIncomingSum();
                Dmitry.getResultBalance();

                Dmitry.getExpensesSum();
                Dmitry.getResultBalance();

                System.out.println("Exercise #4");
                Exercise4.tempControl();



            }
        }
