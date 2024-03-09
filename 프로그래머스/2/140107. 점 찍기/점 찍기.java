import java.util.*;
class Solution {
    public long solution(int k, int d) {
        long answer=0;
        long a;
        for(long i=0; i<=d; i=i+k){
            a = (long)Math.sqrt(((long)d*(long)d) - (i*i));
            answer+= ((a/(long)k) + 1);
            
        }
        return answer;
    }
   
}