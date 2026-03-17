import java.util.Scanner;

public class SecondHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        // Accept 10 integers
        System.out.println("Enter 10 integers:");
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array (Bubble Sort)
        for(int i = 0; i < 10 - 1; i++) {
            for(int j = 0; j < 10 - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("Sorted Array:");
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        // Second highest number
        int secondHighest = arr[8]; 
        System.out.println("\nSecond Highest Number: " + secondHighest);
        sc.close();
    }
} 
