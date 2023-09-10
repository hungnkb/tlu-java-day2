package resource;

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseFunction {
    public static String printNumberASC(int n) {
        int[] listNum = new int[n];
        for (int i = 0; i < n; i++) {
            listNum[i] = i + 1;
        }
        return "[Bai 1]" + " <<< " + Arrays.toString(listNum) + " >>>";
    }

    public static String printNumberDESC(int n) {
        int[] listNum = new int[n];
        for (int i = 0; i < n; i++) {
            listNum[i] = n - i;
        }
        return "[Bai 2]" + " <<< " + Arrays.toString(listNum) + " >>>";
    }

    public static String odd(int[] listNumber) {
        ArrayList<Number> result = new ArrayList<>();
        for (int i = 0; i < listNumber.length; i++) {
            boolean condition = !(listNumber[i] % 2 == 0);
            if (condition) {
                result.add(listNumber[i]);
            }
        }
        return "[Bai 3]" + " <<< " + result + " >>>";
    }

    public static String multiplicationTable(int n) {
        ArrayList<Number> result = new ArrayList<>();
        for (int i = 0; i < constant.MULTIPLICATION_NUMBER.length; i++) {
            result.add(n * constant.MULTIPLICATION_NUMBER[i]);
        }
        return "[BAI 4]" + " <<< " + result + " >>>";
    }

    public static ArrayList<ArrayList<Number>> summaryMultiplicationTable() {
        ArrayList<ArrayList<Number>> result = new ArrayList<>();
        for (int i = 0; i < constant.MULTIPLICATION_NUMBER.length; i++) {
            ArrayList<Number> row = new ArrayList<>();
            for (int j = 0; j < constant.MULTIPLICATION_NUMBER.length; j++) {
                row.add(constant.MULTIPLICATION_NUMBER[i] * constant.MULTIPLICATION_NUMBER[j]);
            }
            result.add(row);
        }
        return result;
    }

    public static String primeNumber(int n) {
        int[] listNum = {2, 3, 4, 5, 6, 7, 8, 9};
        boolean result = false;
        for (int j : listNum) {
            boolean condition = j != n && (n % j == 0);
            if (condition) {
                result = true;
                break;
            }
        }
        if (result) {
            return "[BAI 10] <<< Số nguyên tố >>>";
        } else {
            return "[BAI 10] <<< Không phải số nguyên tố >>>";
        }
    }
}
