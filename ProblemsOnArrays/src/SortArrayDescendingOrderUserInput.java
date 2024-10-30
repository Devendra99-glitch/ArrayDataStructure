// A program using arrays that sorts a list of integers in descending order. Descending order is highest to lowest.
// Set up the program so that the numbers to sort are read in from the keyboard (scanner)

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDescendingOrderUserInput {
    public static void main(String[] args){


        int[] array = inputArray(5);            // creating an array using the method inputArray to get elements from the user.
        System.out.println("Array to be sorted: " + Arrays.toString(array));    // Printing the array entered by the user.
        int[] sortedArray = sortIntegers(array);            // calling the method to sort the array into descending order.
        System.out.println("Array sorted in descending order: " + Arrays.toString(sortedArray));        // printing the array after the sort.
    }

    // Here create a method to generate an array to accept user input for the elements.
    public static int[] inputArray(int length){
        Scanner scanner = new Scanner(System.in);           // scanner class object is created.
        int[] userArray = new int[length];                  // new array is initialized
        for(int i = 0; i < userArray.length; i++){          // iterate through the array using for loop.
            userArray[i] = scanner.nextInt();               // assign each index an input from the user. it will ask for user prompt till the length is satisfied.
        }
        return userArray;                       // return the array that was entered by the user.
    }

    // Method to sort the array in descending order, which takes an array as argument.
    public static int[] sortIntegers(int[] array){
        int[] sortArray = Arrays.copyOf(array, array.length);                   // We create a copy of the array so that the original array does not get modified.
        System.out.println("Copy of Array to be sorted in Descending order: " + Arrays.toString(sortArray));    // We print the copied array.
        boolean flag = true;            // we set flag = true
        int temp;                       // initialize a temp variable to store integer value.
        while(flag){                    // Create a while loop which runs till the condition flag is true.
            flag = false;               // here we set the flag = false, so that the while loop breaks when there are no more elements to sort in the array and return the array.
            for(int i = 0 ; i < sortArray.length - 1; i ++){        // when we iterate through the array, we put length -1 because i+1 will give OutOfBounds exception
                if(sortArray[i] < sortArray[i+1]){                  // this checks whether the element at i index is less than the element at i+1 index
                    temp = sortArray[i];                            // if the condition is true, then we store the element in the i index in a temp variable
                    sortArray[i] = sortArray[i+1];                  // then swap the element at i+1 index to i index.
                    sortArray[i+1] = temp;                          // and then we put the stored value in temp at index i+1
                    flag = true;                                    // and we set the flag to true, so that the while loop runs again.
                }
            }
        }
        return sortArray;           // once all the elements are sorted in descending order, the flag will never be set to true, and the code breaks loop execution to return the array.
    }
}
