// Finding the mean of an array
// As we know the formula for mean is sum of all numbers divided by the total number of numbers.
// Converting this formula for arrays, we get, mean = sum of all elements / total number of elements.


import java.util.Arrays;

public class MeanOfArray {
    public static void main(String[] args){

        int[] newArray = new int[] {10,3,30,12};     // instantiate an array with values using array initializer
        System.out.println("Array: " + Arrays.toString(newArray));  //print the array
        double mean = meanOfArray(newArray);           // then we call the method to find the mean of the array and store it in a double variable.
        System.out.println("Mean of Array is: " + mean);
    }

    // This method is created to calculate the mean of an array passed as an argument to the method.
    private static double meanOfArray(int[] array){
        double numberOfElements = array.length;        // the total number of elements will be equal to the number of elements in the array, which can be taken from array length
        double sum = 0;                                // initialize a variable to add the elements to and set it to 0
        for(int i = 0; i < array.length; i++){      // iterate through the array one element at a time
            sum += array[i];                        // As we are in the for loop, as we move from one index to another, we add the elements at each index to the variable sum.
        }
        return sum / numberOfElements;              // then we return the mean, which is equal to the sum of all elements divided by the total number of elements.
    }
}

// OUTPUT
// Array: [10, 3, 30, 12]
// Mean of Array is: 13.75