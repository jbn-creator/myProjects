import java.util.Scanner;

public class sortingAlgorithms {
    public static void randomNumbers(int[] array) {
        // method implementation
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.println(" ");
        System.out.println(" ");

        System.out.print("Enter how many element should your array contain: ");
        size = scanner.nextInt();
        scanner.nextLine();

        int[] bubbleSort = new int[size];

        randomNumbers(bubbleSort);
        int[] selectionSort = bubbleSort.clone();

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Here are the elements of your array: ");

        System.out.println(" ");
        System.out.println(" ");

        for (int i = 0; i < bubbleSort.length; i++) {
            System.out.printf("%d, ", bubbleSort[i]);
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.println(
                "To sort your array, please enter the number corressponding to the algorithm you want to use\n\n\nBubbleSort(0) | SelectionSort(1) | both for comparison sake (2)");
        System.out.print("Enter your desired sorting Algorithm: ");
        int choice = scanner.nextInt();

        int swaps = 0;
        if (choice == 0) {
            for (int i = 0; i < bubbleSort.length - 2; i++) {
                for (int j = 0; j < bubbleSort.length - 2 - i; j++) {
                    if (bubbleSort[j] > bubbleSort[j + 1]) {
                        int container = bubbleSort[j];
                        bubbleSort[j] = bubbleSort[j + 1];
                        bubbleSort[j + 1] = container;
                        swaps++;
                    }
                }

            }

            System.out.println("Here are the elements of your array now sorted using Bubble Sort: ");

            System.out.println(" ");
            System.out.println(" ");
        } else if (choice == 1) {
            for (int i = 0; i < bubbleSort.length - 2; i++) {
                int min = i;
                for (int j = i + 1; j < bubbleSort.length - 1; j++) {
                    if (bubbleSort[j] < bubbleSort[min]) {
                        min = j;
                    }
                }

                int container = bubbleSort[i];
                bubbleSort[i] = bubbleSort[min];
                bubbleSort[min] = container;
                swaps++;

            }
            System.out.println("Here are the elements of your array now sorted using Selection Sort: ");

            System.out.println(" ");
            System.out.println(" ");
        }

        else if (choice == 2) {
            int swaps2 = 0;

            for (int i = 0; i < selectionSort.length - 2; i++) {
                int min = i;
                for (int j = i + 1; j < selectionSort.length - 1; j++) {
                    if (selectionSort[j] < selectionSort[min]) {
                        min = j;
                    }
                }

                int container = selectionSort[i];
                selectionSort[i] = selectionSort[min];
                selectionSort[min] = container;
                swaps2++;

            }
            System.out.println("Here are the elements of your array now sorted using Selection Sort: ");

            System.out.println(" ");
            System.out.println(" ");

            for (int i = 0; i < selectionSort.length; i++) {
                System.out.printf("%d, ", selectionSort[i]);
            }

            System.out.println(" ");
            System.out.println(" ");

            System.out.printf("The selectionSort algorithm required %d swaps.\n", swaps2);

            System.out.println(" ");
            System.out.println(" ");

            for (int i = 0; i < bubbleSort.length - 2; i++) {
                for (int j = 0; j < bubbleSort.length - 2 - i; j++) {
                    if (bubbleSort[j] > bubbleSort[j + 1]) {
                        int container = bubbleSort[j];
                        bubbleSort[j] = bubbleSort[j + 1];
                        bubbleSort[j + 1] = container;
                        swaps++;
                    }
                }

            }

            System.out.println("Here are the elements of your array now sorted using Bubble Sort: ");

            System.out.println(" ");
            System.out.println(" ");

        }

        else {
            System.out.println(
                    "the number you chose is out of our range please ensure you enter a correct value \n\n\nBubbleSort(0) | SelectionSort(1) | both for comparison sake (2)");
        }

        for (int i = 0; i < bubbleSort.length; i++) {
            System.out.printf("%d, ", bubbleSort[i]);
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.printf("The algorithm required %d swaps.\n", swaps);

        System.out.println(" ");
        System.out.println(" ");

        scanner.close();
    }
}
