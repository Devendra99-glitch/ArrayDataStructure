import java.util.Arrays;

public class PrintingElementsOfArray {
    public static void main(String[] args){

        // -----------> creating a new array
        // I have created an array of type integer which takes integer values, and provided values 1 through 5
        int[] myIntegerArray = new int[] {1,2,3,4,5};

        // -----------> Why dont we just use the print statement to directly print out the array.
        // when just simply putting the array variable name in the print statement, we just get the default toString method of the Object class.
        System.out.println(myIntegerArray);   // the output for this is: [I@5caf905d this mean square bracket, then I, meaning Integer array and then hexadecimal code for the HashCode.


        //  -----------> Printing Elements using Print statement and for loop.
        // Creating the for loop will help us iterate over the array, element by element. and then we use the print statement to print out each element.
        // As the array indexing starts from 0, the indexes in this array are 0,1,2,3,4 and therefore we stop the loop when it reaches 1 less than the array length.
        for(int i = 0; i < myIntegerArray.length; i ++ ){
            System.out.print(myIntegerArray[i] + " ");  // We use the print statement here and not println, because we want to print the array elements in a line.
                                                        // The output we get is: 1 2 3 4 5
        }
        System.out.println();       // this is used just to create a new line.

        // -----------> The default values assigned to the array
        // we instantiate an array with the size and don't use the array initializer, then print it to find the default values of the array.
        int[] newArray = new int[5];
        for(int i = 0 ; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");    // The output we get here is: 0 0 0 0 0, meaning the java compiler assigns 0 as default values to an array.
        }

        System.out.println();       // this is used just to create a new line.

        // -----------> Using the For Each Loop or Enhanced For Loop
        int[] firstTen  = new int[] {1,2,3,4,5,6,7,8,9,10};
        for(int element : firstTen){        // in this loop we declare a variable fo the same type as the array type : it is the array that we are looping over.
                                            // this way we don't need to know the index values, as the loop stores the values at each index in the variable. No way to know index numbers.
            System.out.print(element + " ");    // The output for this is: 1 2 3 4 5 6 7 8 9 10
        }

        System.out.println();       // this is used just to create a new line.

        // -----------> Printing elements in an array using Arrays.toString() which is a class method of java.util.Array helper class.
        // it prints the elements in square brackets, it prints the element at index 0 first, followed by a comma, then the element at index 1 and so on, until all elements are printed.
        System.out.println(Arrays.toString(firstTen));      // The output is: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
