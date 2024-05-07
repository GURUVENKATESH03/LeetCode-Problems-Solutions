/*import java.util.*;

public class Summary_Ranges {

    public static void main(String[] args) {
        int nums[]={0,1,2,4,5,7};
        int ptr1=0;
        int ptr2=1;
        int starting=0;
        List<String> arr=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        while(ptr2!=nums.length){
            if(nums[ptr1]+1==nums[ptr2]){
                ptr1=ptr1+1;
                ptr2=ptr2+1;
            }else{
                System.out.println(arr);
                sb.append(nums[starting]).append("->").append(nums[ptr2-1]);
                arr.add(sb.toString());
                starting=ptr2;
                ptr1=ptr1+1;
                ptr2=ptr2+1;
            }
        }
        System.out.println(arr);
    }
    
}

*/

import java.util.*;

public class Summary_Ranges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return result;
        
        int start = nums[0];
        int end = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == end + 1) {
                end = nums[i];
            } else {
                result.add(getRange(start, end));
                start = nums[i];
                end = nums[i];
            }
        }
        
        result.add(getRange(start, end));
        
        return result;
    }
    
    private static String getRange(int start, int end) {
        if(start == end)
            return Integer.toString(start);
        else
            return start + "->" + end;
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 4, 5, 7};
        List<String> ranges = summaryRanges(nums);
        System.out.println(ranges);
        
        int nums2[] = {0, 2, 3, 4, 6, 8, 9};
        ranges = summaryRanges(nums2);
        System.out.println(ranges);
    }
}
