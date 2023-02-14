package subarray;

import subarray.LinkedList.Node;

import java.util.Arrays;

public class FindMaxSub {
	
	
	public  static LinkedList findMaximumSubList(LinkedList nums) {
		// if nums is empty, return a new linked list
		if(nums.isEmpty()){
			return new LinkedList();
		}
		//Keep check of the current maximum sub array
		Node maximumStart=nums.head;
		Node maximumEnd=nums.head;
		int currentMax=nums.head.data;
		//check the current node
		Node currentNode=nums.head;
		Node current=nums.head;
		while(current!=null){
			current=current.next;
			currentNode=current;
			int sum=nums.head.data;
			//find the starting position of the current max sub list
			if(sum>currentMax){
				maximumStart = current;
				maximumEnd = current;
				currentMax = sum;
			}
			while (currentNode!=null){
				sum+=currentNode.data;
				//find the starting position and the ending position of the max sub list
				if (sum > currentMax) {
					maximumStart = current;
					maximumEnd = currentNode;
					currentMax = sum;
				}
				currentNode=currentNode.next;

			}
		}
		return nums.subList(maximumStart,maximumEnd);
	}
	
	public static int[] findMaximumSubArray(int[] nums){
		int currentMax = nums[0];
		int maximumStart = 0;
		int maximumEnd = 0;
		for (int m = 0; m < nums.length; m++) {
			int sum = nums[m];
			//find the starting position of the current max sub array
			if (sum > currentMax) {
				maximumStart = m;
				maximumEnd = m;
				currentMax = sum;
			}

			for (int n = m + 1; n < nums.length; n++) {
				sum += nums[n];
				//find the starting position and the ending position of the max sub array
				if (sum > currentMax) {
					maximumStart = m;
					maximumEnd = n;
					currentMax = sum;
				}
			}
		}
		int[] result =  Arrays.copyOfRange(nums, maximumStart, maximumEnd + 1);
		return result;
		
	}

}
