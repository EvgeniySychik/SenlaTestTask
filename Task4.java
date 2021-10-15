package SenlaTestTask.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Task4 {
    private static String[][] signsOfDigits = {
            { "  ***  ",
              " *   * ",
              "*     *",
              "*     *",
              "*     *",
              " *   * ",
              "  ***  ",
            },
            { " * ",
              "** ",
              " * ",
              " * ",
              " * ",
              " * ",
              "***",
            },
            { " *** ",
              "*   *",
              "*  * ",
              "  *  ",
              " *   ",
              "*    ",
              "*****",
            },
            { "* * *",
              "    *",
              "    *",
              "* * *",
              "    *",
              "    *",
              "* * *",

    },
            { "*    *",
              "*    *",
              "*    *",
              "******",
              "     *",
              "     *",
              "     *",

    },
            { "******",
              "*     ",
              "*     ",
              "******",
              "     *",
              "     *",
              "******",

    },
            { "******",
              "*     ",
              "*     ",
              "******",
              "*    *",
              "*    *",
              "******",
    },
            { "******",
              "     *",
              "    * ",
              "   *  ",
              "  *   ",
              " *    ",
              "*     ",
            },
            { "******",
              "*    *",
              "*    *",
              "******",
              "*    *",
              "*    *",
              "******",
            },
            { "******",
              "*    *",
              "*    *",
              "******",
              "     *",
              "     *",
              "******",
            }
    };
    private static int rowsInDigitSign = signsOfDigits[0].length;

    private static ArrayList<Integer> getDigits(int num) {
        num = Math.abs(num);

        ArrayList<Integer> digits = new ArrayList<Integer>();
        do {
            digits.add(num % 10);
            num /= 10;
        } while (num != 0);

        Collections.reverse(digits);
        return digits;
    }

    private static void printDigits(List<Integer> digits) {
        final int maxDigit = Collections.max(digits);
        for(int row = 0; row < rowsInDigitSign; row++) {
            for(int digit : digits) {
                String rowSign = signsOfDigits[digit][row];
                if( digit == maxDigit ) {
                    rowSign = rowSign.replace('*', (char)('0' + digit));
                }
                System.out.print(rowSign + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        printDigits(getDigits(num));
    }
}
