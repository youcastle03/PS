class Solution {
    public int[] solution(int[] arr, int k) {
        int sum=0, lt=0;
        int alt=0, art=Integer.MAX_VALUE;
        for(int rt=0; rt<arr.length; rt++){
            sum+=arr[rt];
            if(sum==k) {
                if(rt-lt<art-alt){
                    alt=lt;
                    art=rt;
                }
            }
            while(sum>=k){
                sum-=arr[lt++];
                if(sum==k){
                    if(rt-lt<art-alt){
                        alt=lt;
                        art=rt;
                    }
                }
            }

        }
        int[] answer = new int[2];
        answer[0]=alt;
        answer[1]=art;
        return answer;
    }
}