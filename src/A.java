//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it

import java.util.Random;
public class A {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        shuffleArray(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    static void shuffleArray(int[] arr){
        int index;
        int temp;

        Random random = new Random();

        for(int i=arr.length-1; i>0; i--){
            index = random.nextInt(i+1);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return;
    }
}
