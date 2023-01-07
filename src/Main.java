import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static int[] receivingArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");

        int lengthArr = scanner.nextInt();
        int[] arr = new int[lengthArr];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + ". element of the array: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int tempN;
                if (arr[j + 1] < arr[j]) {
                    tempN = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tempN;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = Main.receivingArr();
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
