// median means the middle value of the array.
// to find the median first we need to sort the array using the Arrays.sort class method, to sort the array in ascending order.
// once the array is sorted, then we check whether the number of elements present in the array are even or odd.
// If odd, then the middle element of the array is the median.
// if even, the median is the average of the middle two values.


import java.util.Arrays;

public class MedianOfAnArray {
    public static void main(String[] args){
        int[] newArray = new int[] {4,6,3,1};       // instantiated a new array
        System.out.println("Median of the Array: " + medianOfArray(newArray));    // printing the median value for the array
    }

    // this method is created to find the median of an unsortedArray.
    private static double medianOfArray(int[] array){
        Arrays.sort(array);                 // to find median we always need the values to be sorted in ascending order.
        System.out.println("Sorted array: " + Arrays.toString(array));         // printing the sorted array
        int n = array.length;               // then we store the length of the array in a variable n
        if(n % 2 == 0){                     // then we check if the length of the array is even
            return (array[n-1]/2 + array[n/2]) / 2.0d;      // if length of the array is even then we return the average of the two middle elements.
                                                            // [n-1]/2 will give the left middle index. and n/2 will give the right middle number.
        }else{                              // or else if the length of the array is odd
            return array[n/2];              // then [n/2] returns the middle index of the array.
        }

    }
}
