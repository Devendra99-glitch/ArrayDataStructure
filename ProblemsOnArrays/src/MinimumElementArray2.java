// Write a method called readInteger() that has no parameters and returns an int.
// It needs to read in an integer from the user - this represents how many elements the user needs to enter
// Write another method called readElements() that has one parameter of type int
// The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
// And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.


import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementArray2 {
    public static void main(String[] args){

        int length = readIntegers();    // the method is called for user input for the length of the array and stored in a variable.
        int[] newArray = readElements(length);      // then the length is passed in the readElements method and the returned array is stored in a newArray.
        System.out.println(Arrays.toString(newArray));  // prints the newArray
        System.out.println(findMin(newArray));          // prints the min value after the method findMin finds the minimum value in the array.
    }

    // This method is used to return the user entered length for the array.
    public static int readIntegers(){
        Scanner scanner = new Scanner(System.in);       // New scanner class instance is created.
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();     // the input given by the user is stored in the variable length, as it would be used as the length for the array.
        return length;      // returns the integer length.
    }

    // this method is created to get the user to enter the elements into the array as per the length required.
    public static int[] readElements(int length){
        Scanner scanner = new Scanner(System.in);       // New Scanner class instance is created.
        int[] userArray = new int[length];              // A new array is created to store the user entered values for the elements.
        for(int i = 0; i < userArray.length; i++){      // iterate through the array one element at a time.
            System.out.println("Enter a number");
            int number = scanner.nextInt();             // the single input entered by the user is added to the variable number.
            userArray[i] = number;                      // the user entered value stored in number is assigned to the corresponding index in the array.
                                                        // the loop asks the user for prompt till the length of the array is full.
        }
        return userArray;                       // returns the complete array entered by user.
    }

    // this method is created to find the minimum element from the array passed as argument to the method call.
    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;            // we set the min integer value to the maximum integer value, so that it can be replaced by smaller numbers in the loop.
        for(int element : array){               // this is an advanced for loop, where we see that a variable is declared similar to the type f the array elements
                                                // this means for each element in array,
            if(element < min){                  // if element o the array is less than minimum
                min = element;                  // then we replace the min value with the array element we found to be smaller than the previous value of min.
            }
        }
        return min;         // then we finally return the min integer value found in the array.
    }
}
