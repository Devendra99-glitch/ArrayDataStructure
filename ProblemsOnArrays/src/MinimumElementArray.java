//  Method called readIntegers that reads a comma delimited list of numbers entered by the user and then return an array.
// Next write a method called findMin that takes the array as an argument and returns the minimum value found in that array.

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementArray {
    public static void main(String[] args){

        int[] userArray = readIntegers(5);          // here we call the readIntegers method with a length, and give it a reference name.
        System.out.println(Arrays.toString(userArray));     // prints the userArray entered by the user, using the Arrays.toString method.
        System.out.println("The minimum element is: " + findMin(userArray));    // Here we call the findMin method in the print statement to return the minimum element from the array.
    }

    // This method takes in user input through the scanner class instance, and then puts it in the array. so we get a user entered array to work with.
    public static int[] readIntegers(int length){
        Scanner scanner = new Scanner(System.in);               // we create a new instance of the Scanner class, which will take the input.
        System.out.println("Enter a list of integers, separated by commas: ");      // This is a print statement that will print the prompt on the console to enter numbers separated by commas.
        String input = scanner.nextLine();      // scanner.nextLine() will store the entire string input by the user into a String variable input.

        String[] sArray = input.split(",");     // Then we create a String array, and then use the String class method split based on the delimiter ",". which will split the String in parts where it finds a comma.
        int[] inputArray = new int[length];             // We instantiate an array with the length given to us in the argument.
        for(int i = 0; i < inputArray.length; i++){     // We iterate through the integer array, element by element
            inputArray[i] = Integer.parseInt(sArray[i]);    // we assign each inputArray element to a corresponding element from the String array.
                                                            // i.e. Assigning index 0 of integerArray tha value stored in index 0 of String array.
                                                            // Here Integer.parseInt wrapper class method is used to convert the String to integer type.
        }
        return inputArray;              // Then return the array entered by the user.
    }

    // Create a method to find the minimum element from the array.
    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;            // we create a variable min with the max integer value assigned to it.
        for(int i = 0; i < array.length; i++){  // we iterate through the array one element at a time.
            if(array[i] < min){                 // if there is a value in the array that is less than the value stored in the min variable.
                min = array[i];                 // then we assign that value from the array to the min variable. this check happens for each element in the array
                                                // and finally the loop breaks when all items have been checked.
            }

        }
        return min;                 // Here we return the minimum value found in the array.
    }
}
