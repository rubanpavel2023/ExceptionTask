package Exceptions_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {

    public static void tempControl() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int temp;
        while (true) {
        System.out.println("Задайте допустимую температуру устройства (от -10 до +35 градусов) ");
        try {
                temp = scanner.nextByte();
                validateTemp(temp);
                System.out.println("Устройство успешно работает. Текущая (заданная) температура: " + temp + " градусов");
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
                    throw new Exception("(!) Вы ввели значение температуры вне допустимого диапазона (от -10 до +35");
                }
            }

//___________________________________________________________________________________
            public static void main (String[]args) throws Exception {
                Exercise4.tempControl();
            }
        }



