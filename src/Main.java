import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task1
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        double[] secondArray = {1.57, 7.654, 9.986};

        int[] thirdArray = {23, 4, 5, 16, 9, 25};

        // task2
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(thirdArray));

        System.out.println();

        // task3
        System.out.println(Arrays.toString(reversedArray(firstArray)));
        System.out.println(Arrays.toString(reversedArray(secondArray)));
        System.out.println(Arrays.toString(reversedArray(thirdArray)));
        System.out.println();

        //task 4
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 1) {
                firstArray[i] += 1;
            }
        }

        System.out.println(Arrays.toString(firstArray));
    }

    public static int[] reversedArray(int[] arr) {
        int[] newArr = new int[arr.length];
        int halfOfTheArray = arr.length / 2;

        for (int i = 0; i < halfOfTheArray; i++) {
            newArr[i] = arr[arr.length - 1 - i];
            newArr[arr.length - 1 - i] = arr[i];
        }

        if (arr.length % 2 == 1) {
            newArr[halfOfTheArray] = arr[halfOfTheArray];
        }

        return newArr;
    }

    public static double[] reversedArray(double[] arr) {
        double[] newArr = new double[arr.length];
        int halfOfTheArray = arr.length / 2;

        for (int i = 0; i < halfOfTheArray; i++) {
            newArr[i] = arr[arr.length - 1 - i];
            newArr[arr.length - 1 - i] = arr[i];
        }
        if (arr.length % 2 == 1) {
            newArr[halfOfTheArray] = arr[halfOfTheArray];
        }

        return newArr;
    }
}