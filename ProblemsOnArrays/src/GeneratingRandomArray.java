import java.util.Arrays;
import java.util.Random;

public class GeneratingRandomArray {
    public static void main(String[] args){

        // Calling the method to generate a random Array
        int[] firstArray = getRandom(5);
        System.out.println(Arrays.toString(firstArray));        // printing the random array using Arrays.toString method.
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
