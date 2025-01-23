import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in the dynamic array: ");
        int numElements = scanner.nextInt();
        ArrayList<Integer> dynamicArray = new ArrayList<>();
        System.out.println("Enter " + numElements + " elements:");
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            dynamicArray.add(element);
        }
        System.out.println("The elements of the dynamic array are: " + dynamicArray);
        System.out.print("Enter a new element to add to the array: ");
        int newElement = scanner.nextInt();
        dynamicArray.add(newElement);
        System.out.println("The updated dynamic array is: " + dynamicArray);
        
        scanner.close();
    }
}
