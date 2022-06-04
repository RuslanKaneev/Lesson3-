import java.util.Arrays;
import java.util.Random;

public class Main {
    static int temp;

    public static void main(String[] args) {
        reversArray();
        System.out.println();
        fillArray100();
        System.out.println();
        arrayIntLess6();
        System.out.println();
        diagonalArray();
        System.out.println();
        arrayReturn(5, 7);
        System.out.println();
        minMaxElement();
        System.out.println();
        int[] array = {1, 2, 2, 3, 2};
        System.out.println(sumNumberArray(array));
        System.out.println();

    }

    //1 задание
    private static void reversArray() {
        int[] massivInt = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(massivInt));
        for (int i = 0; i < massivInt.length; i++) {
            if (massivInt[i] == 0) {
                massivInt[i] = 1;
            } else {
                massivInt[i] = 0;
            }
        }
        System.out.println(Arrays.toString(massivInt));
    }

    //2 задание
    private static void fillArray100() {
        int n = 100;
        int[] arrayInt100 = new int[n];
        for (int i = 0; i <= arrayInt100.length - 1; i++) {
            arrayInt100[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayInt100));
    }

    //3 задание
    private static void arrayIntLess6() {
        int[] arrayIntLess6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrayIntLess6));
        for (int i = 0; i <= arrayIntLess6.length - 1; i++) {
            if (arrayIntLess6[i] < 6) {
                arrayIntLess6[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrayIntLess6));
    }

    //4 задание
    private static void diagonalArray() {
        int n = 5;
        int[][] twoArrayInt = new int[n][n];
        for (int i = 0; i < twoArrayInt.length; i++) {
            for (int j = 0; j < twoArrayInt[0].length; j++) {
                if (i == j || twoArrayInt[0].length - 1 - i - j == 0) {
                    twoArrayInt[i][j] = 1;
                    System.out.print(twoArrayInt[i][j]);
                } else {
                    System.out.print(twoArrayInt[i][j]);
                }
            }
            System.out.println();
        }
    }

    //5 задание
    private static int[] arrayReturn(int len, int initialValue) {
        int[] arrayInt = new int[len];
        for (int i = 0; i < len; i++) {
            arrayInt[i] = initialValue;
            System.out.print(arrayInt[i]);
        }
        return arrayInt;
    }

    //6 задание
    private static int[] fillArray() {
        int[] massiv = new int[10];
        Random rand = new Random();
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = rand.nextInt(30);
        }
        return massiv;
    }

    private static void minMaxElement() {
        int[] arrayInt = fillArray();
        System.out.println(Arrays.toString(arrayInt));
        int max, min;
        max = min = arrayInt[0];
        int indexMax, indexMin;
        indexMax = indexMin = 1;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > max) {
                max = arrayInt[i];
                indexMax = i + 1;
            }
            if (arrayInt[i] < min) {
                min = arrayInt[i];
                indexMin = i + 1;
            }
        }
        System.out.println("Самое большое число: " + max + " по счету: " + indexMax + " в массиве");
        System.out.println("Самое маленькое число: " + min + " по счету: " + indexMin + " в массиве");
    }

    //7 задание
    private static Boolean sumNumberArray(int[] arrayInt) {
        int sumArray = 0;
        int sumElement = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sumArray += arrayInt[i];
        }
        for (int i = 0; i < arrayInt.length; i++) {
            sumElement += arrayInt[i];
            if (sumElement == sumArray - sumElement) {
                return true;
            }
        }
        return false;
    }

}
