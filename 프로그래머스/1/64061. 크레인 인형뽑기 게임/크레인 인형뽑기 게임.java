import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int N = board[0].length;
        int M = moves.length;
        Stack<Integer> basket = new Stack<>();
        for (int i = 0; i < M; i++){
            int m = moves[i]-1;
            int now = 0;
            for(int j = 0; j < N; j++){
                if(board[j][m]!=0){
                    now = board[j][m];
                    board[j][m] = 0;
                    break;  
                }
            }
            if(now==0){
                continue;
            }
            if(!basket.empty()&&(basket.peek()==now)){
                basket.pop();
                answer+=2;
            }
            else{
                basket.push(now);
            }
        }
        return answer;
    }
}
