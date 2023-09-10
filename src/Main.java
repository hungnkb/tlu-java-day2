import resource.ExerciseFunction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Bai 1
        int n1 = 10;
        String result1 = ExerciseFunction.printNumberASC(n1);
        System.out.println(result1);

        // Bai 2
        int n2 = 10;
        String result2 = ExerciseFunction.printNumberDESC(n2);
        System.out.println((result2));

        // Bai 3
        int[] n3 = {1, 2, 3, 4, 5, 6, 7, 12, 9};
        String result3 = ExerciseFunction.odd(n3);
        System.out.println(result3);

        // Bai 4
        int n4 = 2;
        String result4 = ExerciseFunction.multiplicationTable(n4);
        System.out.println(result4);

        // Bai 5
        System.out.println("[Bai 5] >>> " );
        ArrayList<ArrayList<Number>> result5 = ExerciseFunction.summaryMultiplicationTable();
        for (int i = 0; i < result5.size(); i++) {
            for (int j = 0; i < result5.get(i).size(); j++) {
                System.out.println(result5.get(i).get(j));
            }
        }

        // Bai 10
        int n10 = 12;
        String result10 = ExerciseFunction.primeNumber(n10);
        System.out.println(result10);
    }
}
