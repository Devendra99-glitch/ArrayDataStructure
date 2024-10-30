import java.util.Arrays;
import java.util.Random;

// Program using arrays that sorts a list of integers in descending order. Descending order means from highest to lowest.
// Steps of doing that:
// First, create an array of randomly generated integers.
// Print the array before we sort it.
// Sort the array in ascending order using the Arrays.sort method.
// Print the array after we sort it.
// Then create a method to sort the array in descending order and pass the sorted array to it.
// print the array in descending order.

public class SortingArrayDescendingOrder {
    public static void main(String[] args){

        // Calling the method to generate a random Array
        int[] unsortedArray = getRandom(5);
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));    // printing the random array that is generated which will be unsorted.
        Arrays.sort(unsortedArray);                                                 // method to sort the array, we don't need to use this method to sort in ascending order, we can directly call the sortIntegers method
        System.out.println("Sorted array in Ascending order: " + Arrays.toString(unsortedArray));   // printing the sorted array
        int[] descendingArray = sortIntegers(unsortedArray);                                        // calling the method for sorting the array in descending order
        System.out.println("Array in descending order: " + Arrays.toString(descendingArray));       // prints out the array sorted in descending order.

    }

    // Creating a method to return a Random Array
    // we create a static method, as we can only call static methods in the main method.
    // we need the length of the array to be taken as the argument to generate the array.
    public static int[] getRandom(int length){
        Random random = new Random();                       // random is another class in the java.util library, which has methods to return random numbers.
        int[] randomArray = new int[length];                // We instantiate a new array, with the length argument that will be passed when the method is called.
        for(int i = 0; i < randomArray.length ; i++ ){      // then we use a for loop, to assign a random to each element in the array.
            randomArray[i] = random.nextInt(100);    // if we don't pass any argument to the nextInt method, it will generate a value from 0 to MAX int value.
        }
        return randomArray;
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
