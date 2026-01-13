class Solution {
    public String solution(String my_string, String alp) {
        char[] answer = my_string.toCharArray();
        for(int i=0; i<answer.length; i++){
            if(answer[i]==alp.charAt(0)){
                answer[i]=Character.toUpperCase(answer[i]);
            }
        }
        return new String(answer);
    }
}