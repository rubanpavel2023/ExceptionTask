package Exceptions_task;

import java.util.Scanner;

public class Exercise1 {
        public static void getNumber() {
            int number;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number:");
            while (true) {
                try {
                    number = Integer.parseInt(scanner.nextLine());
                    System.out.println("entered number: " + number);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: The entered number is not a number. Please enter a number");
                }
            }
        }
//_________________________________________________________
        public static void main(String[] args) {
            Exercise1.getNumber();
            System.out.println("________________________");
        }
    }

