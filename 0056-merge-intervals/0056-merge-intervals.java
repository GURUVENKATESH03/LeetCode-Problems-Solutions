class Solution {
    public int[][] merge(int[][] intervals) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < intervals.length; i++) {
			min = Math.min(min, intervals[i][0]);
			max = Math.max(max, intervals[i][0]);
		}
		
		int[] range = new int[max - min + 1];
		for (int i = 0; i < intervals.length; i++) {
			range[intervals[i][0] - min] = Math.max(intervals[i][1] - min, range[intervals[i][0] - min]); 
		}
		
		int start = 0, end = 0;
		LinkedList<int[]> result = new LinkedList<>();
		for (int i = 0; i < range.length; i++) {
			if (range[i] == 0) {
				continue;
			}
			if (i <= end) {
				end = Math.max(range[i], end);
			} else {
				result.add(new int[] {start + min, end + min});
				start = i;
				end = range[i];
			}
		}
		result.add(new int[] {start + min, end + min});
		return result.toArray(new int[result.size()][]);
	}
}
/*
My Code with the list solution
 for (int i = 1; i < intervals.length ; i++) {
            List<Integer> list = new ArrayList<>();
            if ((intervals[i][0] <= intervals[i - 1][1])) {
                start = intervals[i - 1][0];
                end = intervals[i][1];
                list.add(start);
                list.add(end);
                nwarray.add(list);
                continue;
            } else {
                int begin = intervals[i][0];
                int stop = intervals[i][1];
                list.add(begin);
                list.add(stop);
                nwarray.add(list);
                continue;
            }
        }
        System.out.println(nwarray);
*/