// creating a method to sort an unsorted array in ascending order.
// this can be achieved by iterating through the array and swapping the element indices.

import java.util.Arrays;

public class ManualAscendingSort {
    public static void main(String[] args){

        int[] newArray = new int[] {10,9,8,5,6,7,4,3,2,1};      // instantiated an array with values
        System.out.println("Array before sorting: " + Arrays.toString(newArray));   // prints the unsorted array that has been created.
        int[] sortedArray =  sortArray(newArray);                       // then te sortArray method is called and the returned array is store in sortedArray.
        System.out.println("Array after sorting: " + Arrays.toString(newArray));    // prints the sorted array.

    }

    // this method is created to sort an array given as argument in ascending order.
    private static int[] sortArray(int[] array){
        int[] copyArray = Arrays.copyOf(array,array.length);                // first create a copy of array to keep the original intact.
        System.out.println("Copied Array: " + Arrays.toString(copyArray));  // printing the copied array on the console.
        boolean flag = true;                        // set a boolean variable flag to true. this will start the while loop
        int temp;                                   // a temporary variable to store intermediate values so that we dont loose them when swapping.
        while(flag){                                // while the flag is set to true, the loop will run, till the flag is set to false.
            flag = false;                           // as soon as we enter the loop we set the flag to false, because this will help to break out of the loop when the array is sorted
                                                    // and the if condition is never true anymore
            for(int i = 0; i < copyArray.length -1 ; i++){      // iterate through the array one element at a time.
                if(copyArray[i] > copyArray[i+1]){              // we check whether the array element at i index is greater than the element at i + 1 index
                    temp = copyArray[i];                        // if condition is true, we swap the two numbers. first we place the element at index i in a temp variable
                    copyArray[i] = copyArray[i+1];              // then we swap the array element at index i with element at index i + 1
                    copyArray[i+1] = temp;                      // then the element stored in temp is assigned to the index i + 1. this logic will swap the elements at the two indices.
                    flag = true;                                // then we set the flag to true, so that the condition for the while loop does not break, and the next two elements are checked.
                    System.out.println("----->" + Arrays.toString(copyArray));  //  this prints out the intermediate steps in swapping numbers.
                }
            }
        }
        return copyArray;           // when the if condition is never true anymore, the flag is never set to true again and the execution breaks out of the while loop.
                                    // and we return the sorted array back.
    }
}

// OUTPUT
//Array before sorting: [10, 9, 8, 5, 6, 7, 4, 3, 2, 1]
//Copied Array: [10, 9, 8, 5, 6, 7, 4, 3, 2, 1]
//        ----->[9, 10, 8, 5, 6, 7, 4, 3, 2, 1]
//        ----->[9, 8, 10, 5, 6, 7, 4, 3, 2, 1]
//        ----->[9, 8, 5, 10, 6, 7, 4, 3, 2, 1]
//        ----->[9, 8, 5, 6, 10, 7, 4, 3, 2, 1]
//        ----->[9, 8, 5, 6, 7, 10, 4, 3, 2, 1]
//        ----->[9, 8, 5, 6, 7, 4, 10, 3, 2, 1]
//        ----->[9, 8, 5, 6, 7, 4, 3, 10, 2, 1]
//        ----->[9, 8, 5, 6, 7, 4, 3, 2, 10, 1]
//        ----->[9, 8, 5, 6, 7, 4, 3, 2, 1, 10]
//        ----->[8, 9, 5, 6, 7, 4, 3, 2, 1, 10]
//        ----->[8, 5, 9, 6, 7, 4, 3, 2, 1, 10]
//        ----->[8, 5, 6, 9, 7, 4, 3, 2, 1, 10]
//        ----->[8, 5, 6, 7, 9, 4, 3, 2, 1, 10]
//        ----->[8, 5, 6, 7, 4, 9, 3, 2, 1, 10]
//        ----->[8, 5, 6, 7, 4, 3, 9, 2, 1, 10]
//        ----->[8, 5, 6, 7, 4, 3, 2, 9, 1, 10]
//        ----->[8, 5, 6, 7, 4, 3, 2, 1, 9, 10]
//        ----->[5, 8, 6, 7, 4, 3, 2, 1, 9, 10]
//        ----->[5, 6, 8, 7, 4, 3, 2, 1, 9, 10]
//        ----->[5, 6, 7, 8, 4, 3, 2, 1, 9, 10]
//        ----->[5, 6, 7, 4, 8, 3, 2, 1, 9, 10]
//        ----->[5, 6, 7, 4, 3, 8, 2, 1, 9, 10]
//        ----->[5, 6, 7, 4, 3, 2, 8, 1, 9, 10]
//        ----->[5, 6, 7, 4, 3, 2, 1, 8, 9, 10]
//        ----->[5, 6, 4, 7, 3, 2, 1, 8, 9, 10]
//        ----->[5, 6, 4, 3, 7, 2, 1, 8, 9, 10]
//        ----->[5, 6, 4, 3, 2, 7, 1, 8, 9, 10]
//        ----->[5, 6, 4, 3, 2, 1, 7, 8, 9, 10]
//        ----->[5, 4, 6, 3, 2, 1, 7, 8, 9, 10]
//        ----->[5, 4, 3, 6, 2, 1, 7, 8, 9, 10]
//        ----->[5, 4, 3, 2, 6, 1, 7, 8, 9, 10]
//        ----->[5, 4, 3, 2, 1, 6, 7, 8, 9, 10]
//        ----->[4, 5, 3, 2, 1, 6, 7, 8, 9, 10]
//        ----->[4, 3, 5, 2, 1, 6, 7, 8, 9, 10]
//        ----->[4, 3, 2, 5, 1, 6, 7, 8, 9, 10]
//        ----->[4, 3, 2, 1, 5, 6, 7, 8, 9, 10]
//        ----->[3, 4, 2, 1, 5, 6, 7, 8, 9, 10]
//        ----->[3, 2, 4, 1, 5, 6, 7, 8, 9, 10]
//        ----->[3, 2, 1, 4, 5, 6, 7, 8, 9, 10]
//        ----->[2, 3, 1, 4, 5, 6, 7, 8, 9, 10]
//        ----->[2, 1, 3, 4, 5, 6, 7, 8, 9, 10]
//        ----->[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//Array after sorting: [10, 9, 8, 5, 6, 7, 4, 3, 2, 1]