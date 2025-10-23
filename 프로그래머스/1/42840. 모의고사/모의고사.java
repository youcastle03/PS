import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5}; 
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};  
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; 
        
        int[] score = new int[3];
        
        for (int i = 0; i < answers.length; i++){
            if (answers[i] == one[i%5]){
                score[0]++;
            }
            if (answers[i] == two[i%8]){
                score[1]++;
            }
            if (answers[i] == three[i%10]){
                score[2]++;
            }
        }
        
        int maxScore = score[0];
        for(int i = 1; i <= 2; i++){
            if(maxScore < score[i]){
                maxScore = score[i];
            }
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 3; i++) {
            if(maxScore == score[i]){
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}