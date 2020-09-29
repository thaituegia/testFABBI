package Solution;
import java.util.*;
public class Solution {
	public List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> output = new ArrayList();
	    output.add(new ArrayList<Integer>());

	    for (int num : nums) {
	      List<List<Integer>> newSubsets = new ArrayList();
	      for (List<Integer> curr : output) {
	        newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
	      }
	      for (List<Integer> curr : newSubsets) {
	        output.add(curr);
	      }
	    }
	    return output;
	  }
	    public String longestCommonPrefix(String[] strs) {
	    if (strs.length == 0) return "";
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++)
	        while (strs[i].indexOf(prefix) != 0) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) return "";
	        }        
	    return prefix;
	    }
}
