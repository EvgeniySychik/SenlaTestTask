package SenlaTestTask.Task2;

// Task2. Создайте программу, которая будет вычислять и выводить на экран простые множители,
// из которых состоит целое число, введенное пользователем. Если введенное число не целое,
// то нужно сообщать пользователю об ошибке.

import java.util.ArrayList;
import java.util.Scanner;

class Task2 {
    private static ArrayList<Integer> getPrimeMultipliers(int num) {
        ArrayList<Integer> multipliers = new ArrayList<Integer>();
        int multiplier = 2;
        while (num != 1) {
            if (num % multiplier == 0) {
                multipliers.add(multiplier);
                num /= multiplier;
            } else {
                multiplier++;
            }
        }

        return multipliers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        try {
            int num = Integer.parseInt(str);
            System.out.println(getPrimeMultipliers(num));
        } catch (NumberFormatException error) {
            System.out.println("Your input is not an integer. Please input integer.");
        }
    }
}