import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        Map<String,Integer> order=new HashMap<>();
        order.put("code",0);
        order.put("date",1);
        order.put("maximum",2);
        order.put("remain",3);
        
        answer= Arrays.stream(data).filter(x -> x[order.get(ext)] < val_ext).toArray(int[][]::new);
        Arrays.sort(answer, (o1, o2) ->  o1[order.get(sort_by)] - o2[order.get(sort_by)]);
         
        return answer;
    }
}