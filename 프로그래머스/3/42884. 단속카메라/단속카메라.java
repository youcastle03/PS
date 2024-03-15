import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer=0;
        int cam;
        Arrays.sort(routes, (a, b) -> a[1] - b[1]);
        cam=routes[0][1];
        answer++;
        for (int i = 1; i < routes.length; i++) {
            if (routes[i][0] > cam) {
                answer++;
                cam = routes[i][1];
            }
  
        }
        return answer;
    }
}