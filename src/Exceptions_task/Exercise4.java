package Exceptions_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {

    public static void tempControl() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int temp;
        while (true) {
        System.out.println("Set the permissible temperature of the device (from -10 to +35 degrees)");
        try {
                temp = scanner.nextByte();
                validateTemp(temp);
                System.out.println("The device is working successfully. Current (set) temperature: " + temp + " degrees");
                break;
            }
        catch(InputMismatchException ex){
                    System.out.println("Invalid number format: " + ex.getMessage());
                    scanner.next();
                }
        catch(Exception exp){
                    System.out.println(exp.getMessage());
                }
            }
        }

            private static void validateTemp ( int temp) throws Exception {
                byte max = 35;
                byte min = -10;
                if (temp > max || temp < min) {
                    throw new Exception("(!) You entered a temperature value outside the acceptable range (от -10 до +35");
                }
            }


//___________________________________________________________________________________
            public static void main (String[]args) throws Exception {
                Exercise4.tempControl();
            }
        }



