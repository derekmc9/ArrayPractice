import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]) {
        //Initialize array with unsorted String values
        String[] names = {"Ziggy", "Bif", "Marty", "Amy", "Beth", "Louie"};

        //Display the original unsorted array
        System.out.println("Values before sorting: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();

        //Call the selection sort method
        selectionMethod(names);

        //Display the sorted array
        System.out.println("Values after sorting: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
    }

    public static void selectionMethod(String[] a) {
        //Outer loop: moves through each position in the array
        //After each pass, one more element is in its final sorted position
        for (int i = 0; i < a.length; i++) {
            //Assume the current position holds the smallest value
            int smallestIndex = i;

            //Inner loop: find the actual smallest element in the unsorted portion
            //Start at i+1 since we already assume i is the smallest
            for (int j = i + 1; j < a.length; j++) {
                //Compare strings alphabetically
                //compareTo returns > 0 if a[smallestIndex] comes after a[j]
                if (a[smallestIndex].compareTo(a[j]) > 0) {
                    //Update smallestIndex if we found a smaller element
                    smallestIndex = j;
                }
            }

            //Swap the smallest element found with element found at position i
            //This moves the smallest unsorted element to its final position
            String temp = a[smallestIndex];
            a[smallestIndex] = a[i];
            a[i] = temp;
        }
    }
}

