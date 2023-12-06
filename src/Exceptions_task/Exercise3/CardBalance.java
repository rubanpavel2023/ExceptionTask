package Exceptions_task.Exercise3;


class CardBalance {
    static double balance;

    static void getResultBalance() {
        balance = CardTransaction.income - CardTransaction.expenses;
        System.out.println("___________Your current balance (UAH): " + balance);
        System.out.println();
    }
}
