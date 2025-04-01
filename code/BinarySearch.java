package code;

import java.util.Arrays;

public class BinarySearch {

    private static final int[] listOfElements =
            {
                    1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                    11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                    21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                    31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                    41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                    51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                    61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                    71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                    81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                    91, 92, 93, 94, 95, 96, 97, 98, 99, 100
            };


    public static void main(String[] args) {
        System.out.println("Target Found: " + searchRecursive(listOfElements, 60));

        System.out.println("Target Found: " + searchRecursive(listOfElements, 0));

        System.out.println("Target Found: " + searchRecursive(listOfElements, 1));

        System.out.println("Target Found: " + searchRecursive(listOfElements, 101));

        System.out.println("Target Found: " + searchRecursive(listOfElements, 100));

        System.out.println("Target Found: " + searchRecursive(listOfElements, 20));
    }

    public static int search(int[] array, int element) {
        int first = 0;
        int last = array.length - 1;

        while (first <= last) {

            int midpoint = (first + last) / 2;

            if (array[midpoint] == element)
                return midpoint;

            else if (array[midpoint] < element)
                first = midpoint + 1;

            else
                last = midpoint - 1;
        }

        throw new IllegalArgumentException("Element not found in the array");
    }

    public static boolean searchRecursive(int[] array, int element) {
        if (array.length == 0)
            return false;

        int middle = array.length / 2;

        if (array[middle] == element)
            return true;

        else if (array[middle] < element)
            return searchRecursive(
                    Arrays.copyOfRange(array, middle + 1, array.length),
                    element
            );

        else
            return searchRecursive(
                    Arrays.copyOfRange(array, 0, middle),
                    element
            );
    }
}
