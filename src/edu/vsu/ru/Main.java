package edu.vsu.ru;

public class Main {

    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    private static void example1() {
        Integer[] array = { 7, 10, 3, 8, 7, 2, 1, 9, 5, 7 };
        boolean[] fixed = {true, false, true, true, false, false, true, true, false, true};

        SortArray.sort(array, fixed);
        String trueAnswer = "1, !10, 3, 7, !7, !2, 7, 8, !5, 9";
        writeAnswer(array, trueAnswer, "1");
    }

    private static void example2() {
        Integer[] array = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        boolean[] fixed = {true, false, true, true, false, false, true, true, false, true};

        SortArray.sort(array, fixed);
        String trueAnswer = "10, !10, 10, 10, !10, !10, 10, 10, !10, 10";
        writeAnswer(array, trueAnswer, "2");
    }

    private static void example3() {
        Integer[] array = { 10 };
        boolean[] fixed = {false};

        SortArray.sort(array, fixed);
        String trueAnswer = "!10";
        writeAnswer(array, trueAnswer, "3");
    }

    private static void writeAnswer(Integer[] array, String trueAnswer, String n) {
        System.out.println();
        System.out.println("Пример" + " " + n + ":");
        System.out.println("Массив, который получился:");
        int k = 1;
        for (Integer v:array
        ) {
            System.out.print((k == 1 ? "" : ", ") + v);
            k++;
        }

        System.out.println();
        System.out.println("Массив, который должен был получиться (восклицательными знаками отмечены устойчивые позиции):");
        System.out.println(trueAnswer);
    }
}
