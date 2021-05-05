//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class ArrayStatsRunner
{
	public static void main(String args[])
	{
		int[] nums = {3, 3, 3, 3, 3, 9, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8};
	    System.out.println(ArrayStats.getGroupSize(nums,9)); //prints 1

	    System.out.println("size one== "+ArrayStats.groupCount(nums,1));//prints 7
	    System.out.println("size two== "+ ArrayStats.groupCount(nums,2)); //prints 6
	    System.out.println("size three== "+ArrayStats.groupCount(nums,3));//prints 5
	    System.out.println("size four== "+ArrayStats.groupCount(nums,4));//prints 3
	    System.out.println("size five== "+ArrayStats.groupCount(nums,5));//prints 2
	    System.out.println("size six== "+ArrayStats.groupCount(nums,6) + "\n\n");//prints 1
	    
	    int[] nums2={1,1,1,2,2,2,3,3,3,4,5,6,7};
	    System.out.println(ArrayStats.getGroupSize(nums2,1)); //prints 3
	    System.out.println("size two== "+ ArrayStats.groupCount(nums2,2)); //prints 3
	    System.out.println("size two== "+ArrayStats.groupCount(nums2,3)); //prints 3
	    System.out.println("size two== "+ArrayStats.groupCount(nums2,5)); //prints 0
	}
}



