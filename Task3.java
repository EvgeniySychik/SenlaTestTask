package SenlaTestTask.Task3;

// Task3.	Создайте программу, которая будет:
//-	подсчитывать количество гласных в словах
//-	выводить слова отсортированным списком по количеству гласных (сначала те, у которых больше гласных)
//-	делать первую гласную букву в слове заглавной
//Предложение вводится пользователем вручную русскими буквами. Разделитель пробел (“ ”).

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
    static Set<Character> vowels = new HashSet<Character>(
            Arrays.asList(new Character[] { 'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е' })
    );

    static int countVowels(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }

        return count;
    }

    private static String toUpperFirstVowel(String word) {
        char firstChar = word.charAt(0);
        if (vowels.contains(firstChar)) {
            return Character.toUpperCase(firstChar) + word.substring(1);
        }

        return word;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = toUpperFirstVowel(words[i]);
        }

        Arrays.sort(words, (new VowelsCountComparator()).reversed());

        System.out.println(Arrays.asList(words));
    }
}

class VowelsCountComparator implements Comparator<String> {
    public int compare(String a, String b) {
        return Task3.countVowels(a) - Task3.countVowels(b);
    }
}
