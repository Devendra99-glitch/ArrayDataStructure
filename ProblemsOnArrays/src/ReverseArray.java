//      Write a method called reverse() with an int array as a parameter.
//      The method should not return any value. In other words, the method is allowed to modify the array parameter.
//      To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//      For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].




import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){

        int[] newArray = new int[] {1,2,3,4,5};         // instantiating a new array with values..
        System.out.println("The Array to be reversed: " + Arrays.toString(newArray));       // printing the newArray before reversing the array
        reverse(newArray);              // calling the reverse method on the Array.
        System.out.println("The reversed Array: " + Arrays.toString(newArray)); // printing the reversed array.
    }

    // This method is created to reverse the array passed as argument to the method.
    private static void reverse(int[] array){
        int temp;                   // we create a temporary variable to store values of the elements in the array so that when we swap we dont loose them.
        int lastIndex = array.length - 1 ;          // last index of the array is shown to simplify the code in the loop and make it more readable.
        for(int i = 0 ; i < array.length /2; i++){      // iterating through half of the array, because when we swap elements to reverse the array, once we reach the midpoint of the array
                                                        // the other half has already been swapped. so we do not need to iterate through the whole array.
            temp = array[i];                        // we store the element to be swapped in a temp location so that when swapping we dont loose the element.
            array[i] = array[lastIndex - i];        // then we swap the element at i index with the element at the lastIndex - i place.
            array[lastIndex - i] = temp;            // then we place the value of the i index element, which was previously stored in the temp variable to the lastIndex -1 place.
            System.out.println(Arrays.toString(array));     // this will print the intermediate steps in the loop, and show us how the swapping is taking place.
        }
    }
}
