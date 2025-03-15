class Solution {
    public long[] solution(long n) {
        int count=0;
        long m=n;
        while(m>0){
            m/=10;
            count++;
        }
        long[] answer = new long[count];
    
        for(int i=0; i<count; i++){
            answer[i]=(n%10);
            n/=10;
        }
        return answer;
    }
    
}