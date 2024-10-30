import java.util.Arrays;
import java.util.Random;

public class javaUtilArraysHelperClassMethods {
    public static void main(String[] args){

        // We call the getRandom method to generate a Random Array. each time we run the code, a new random array will be generated.
        // Go out of the main method block to see the getRandom method.
        int[] randomArray = getRandom(5);


        // The first method of the java.util.Arrays class we will see is the
        // -----------> Arrays.toString(arrayName) method, which is used to print the elements of an array.
        System.out.println(Arrays.toString(randomArray));    // The output on the console is a random Array

        // -----------> Arrays.sort(arrayName) method is used to sort the values in the array in ascending order
        Arrays.sort(randomArray);                           // this will sort the array in ascending order. This method does not return anything.  this method will make changes in the original array
                                                            // its return type is void. so we don't get a new array, instead the already existing array is sorted.
        System.out.println(Arrays.toString(randomArray));   // this print statement will output the sorted randomArray.

        // -----------> Arrays.fill(arrayName, value) method will fill the array indices with value provided as argument.
        // Initializing an array with the same value in all indexes instead of getting default values.
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));  // Here the output will be an array with default values: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Arrays.fill(secondArray,5);                    // this method will make changes in the original array
        System.out.println(Arrays.toString(secondArray));  // Here the output will be an array with values 5 at each index: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

        // -----------> Arrays.copyOf(arrayName, newLength) method is used to create a copy of the original array, so that operations that are performed do not change the original.
        // Array copy creates a new instance of an array and copies the elements over to the new array.
        int[] thirdArray = Arrays.copyOf(randomArray,randomArray.length);   // Full copy: This method will create a copy of the randomArray with the same length as of randomArray.
        System.out.println(Arrays.toString(thirdArray));                // this will print the same array as random array (sorted: as the sort operation is performed on original array),
                                                                        // but any operations done on thirdArray will not change randomArray.
        //  Partial copy: if we don't want the entire length of the array to be copied, then we can put a lesser length, and the elements till that index will be copied.
        //  Copy + Extra elements: if we use length that is greater than the original array, then the extra indices will be initialized with 0's.

        // -----------> Arrays.binarySearch() method is used to perform interval search on an array with a target to locate.
        // Important Things to note:
        // - Array must be sorted. - if there are duplicate values in the array, then there is no guarantee to which one it'll match. - elements must be comparable (of the same type)
        // This method return: - the position of a match, if found. - return a -1 if no match is found.
        String[] sArray = {"William", "Karen", "Mark", "Donald", "Chris"};      // Here we create a string array with names.
        Arrays.sort(sArray);                                                    // We then use the Arrays.sort to sort them in ascending order
        System.out.println(Arrays.toString(sArray));                            // we print the sorted array.
        if(Arrays.binarySearch(sArray, "Karen") >= 0){                      // then we check using the Arrays.binarySearch method, if Karen is in the sArray.
                                                                                // >= 0 condition is used because, if a match is found then the index is returned which will be 0 or greater than 0.
            System.out.println("Karen was found");
        }

        // -----------> Arrays.equals(arrayName1,arrayName2) method is used to see if two array are equal.
        // Two arrays are said to be equal, if they have the same length, and have the same element at each index.
        // I created two arrays of the same length and the same elements.
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if(Arrays.equals(s1,s2)){                       // this method is used in condition to check if the arrays are equal, if equal then "Arrays are equal is printed".
            System.out.println("Arrays are equal");
        }

        int[] s3 = {5,2,3,4,1};                         // in this newly created array we swapped positions for 1 and 5
        if(Arrays.equals(s1,s3)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal"); // the output for this condition will give Arrays are not equal. Because the order of elements is not same.
        }

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
}
