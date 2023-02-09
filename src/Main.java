

import java.util.Arrays;
public class Main {
    public static int missingNumber(int[] nums) {
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsCopy);

        System.out.println("nums" + Arrays.toString(nums));
        System.out.println("numCopy" + Arrays.toString(numsCopy));

        int n = numsCopy.length;
        if(numsCopy[numsCopy.length-1] != n) {
            return n;
        }

        for(int i=0; i<numsCopy.length; i++) {
            if(numsCopy[i] != i) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));

    }
}
