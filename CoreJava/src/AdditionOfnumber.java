import java.util.HashMap;
import java.util.Map;

public class AdditionOfnumber
{
	
	public static void  addNumber(int[] num,int sum)
	{
		//1,2,3,4,5 
		
		HashMap<Integer, Integer> hm=new HashMap<>();
		for (int i = 0; i < num.length; i++) 
		{
			//1 o(n2)
			/*
			 * for (int j = i+1; j < num.length; j++) { System.out.println(""); int
			 * q=num[i]+num[j]; if(q==sum) System.out.println(num[i]+" and "+num[j]); }
			 */
			//1,2,8,4,5
			int complement=sum-num[i];
			System.out.println("complement "+complement);
			if (hm.containsKey(complement)) {
				
				System.out.println(" present ");
			}
			else
			{
				hm.put(complement, i);
			}
	
		}
		System.out.println(hm.toString());
	}
	
	 // Time complexity: O(n)
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
          //  System.out.println(complement);
          //1,2,8,4,5
            if (numMap.containsKey(complement)) {
            	System.out.println(complement+" :: "+nums[i]);
            	//System.out.println(numMap.get(complement)+" and "+i);
            	//System.out.println(i);
               // return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            	//numMap.put(complement,i);
            }
        }
        return new int[] {};
    }
public static void main(String[] args)
{
	int[] nums= {1,2,3,4,5};
	int target=7;
	
	//addNumber(m,n);
	//findTwoSum(m,n);
	int[] indices = findTwoSum(nums, target);

    if (indices.length == 2) {
        System.out.println(indices[0] + " " + indices[1]);
    } else {
        System.out.println("No solution found!");
    }
}




}
