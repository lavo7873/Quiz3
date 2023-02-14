package subarray;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Test
        LinkedList nums = new LinkedList(new int[] {13,-3,-25,-20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7});
        FindMaxSub findMaxSub=new FindMaxSub();
        System.out.println("The Max SubList is: " + findMaxSub.findMaximumSubList(nums).toString());
        int[] array = new int[] {13,-3,-25,-20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        System.out.println("The Max SubArray is: " + Arrays.toString(findMaxSub.findMaximumSubArray(array)));
    }
}