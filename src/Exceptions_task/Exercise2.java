package Exceptions_task;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise2 {
        public static double getPrice(double[] PriceMass) {
            Scanner scan = new Scanner(System.in);
            int Index;
            while (true) {
                System.out.println("Enter array index");
                try {
                    Index = scan.nextInt();
                    if (Index >= 0 && Index < PriceMass.length) {
                        System.out.println("price for the selected date: " + PriceMass[Index]);
                        break;
                    } else {
                        System.out.println("Index mismatch");
                        scan.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("wrong format. enter an integer");
                    scan.next();
                }
            }
            return PriceMass[Index];
        }

        //version 2
        public static double getPrice2(double[] PriceMass) {
            int Index;
            double Price;
            Scanner scan2 = new Scanner(System.in);
            while (true) {
                try {
                    System.out.println("Enter array index");
                    Index = scan2.nextInt();
                    switch (Index) {
                        case 0, 1, 2, 3, 4:
                            Price = PriceMass[Index];
                            System.out.println("Price: " + Price);
                            break;
                        default:
                            System.out.println("Invalid index. Please enter an index between 0 and 4.");
                    }
                    scan2.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Wrong format. Enter an integer");
                    scan2.next();
                }
            }
        }
    }

