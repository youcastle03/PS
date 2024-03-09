class Solution {
    public int solution(int[] stones, int k) {
        int max=0;  //돌중 가장 값이 큰값
        for(int i:stones){
            if(i>max){
                max=i;
            }
        }
        int start=0;
        int end=max;
        int answer=0;
        while(start<=end){
            int mid =(start+end)/2;
            if(can(mid,stones,k)){
                start=mid+1;
                answer=mid;
            }
            else{
                end=mid-1;
            }
        }
        return answer;
    }
    public static boolean can(int mid, int[] stones, int k){
        int count=0;  //건널수 없는거 몇개 연속되는지 셈
        for(int i:stones){
            if(i<mid){
                count++;
                if (count>=k){
                    return false;  //k번 이상 연속되므로 건널수 없다.
                }
            }
            else{
                count=0;
            }
        }
        return true;
    }
}