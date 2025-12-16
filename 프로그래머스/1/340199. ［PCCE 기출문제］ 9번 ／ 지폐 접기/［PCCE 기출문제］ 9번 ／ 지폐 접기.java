class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int walletSmall = Math.min(wallet[0], wallet[1]);
        int walletLarge = Math.max(wallet[0], wallet[1]);
        int billSmall = Math.min(bill[0], bill[1]);
        int billLarge = Math.max(bill[0], bill[1]);
        
         while(true){
            if(walletLarge < billLarge || walletSmall < billSmall) {
                billLarge /= 2;
                answer ++;
            }
            if(billLarge < billSmall){
                int temp = billLarge;
                billLarge = billSmall;
                billSmall = temp;
            }
            
            if(walletSmall >= billSmall && walletLarge >= billLarge){
                break;
            }
        }
       
       
       
        return answer;
    }
}