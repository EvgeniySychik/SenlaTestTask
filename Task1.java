package SenlaTestTask.Task1;

// Task1.	Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке.
// Если цифр нет, то возвращаемая сумма должна быть равна 0.

public class Task1 {
    private static int sumOfDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("as2j h34 h78gg"));
    }
}

