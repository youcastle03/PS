import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Deque<String> d = new ArrayDeque<>();
        if(cacheSize==0){
            answer=cities.length*5;
            return answer;
        }
        for (int i = 0; i<cities.length; i++){
            if(d.size()<cacheSize){
                if(d.contains(cities[i].toLowerCase())){
                    d.remove(cities[i].toLowerCase());
                    d.addLast(cities[i].toLowerCase());
                    answer++;
                }
                else{
                    d.addLast(cities[i].toLowerCase());
                    answer+=5;
                }
            }
            else{
                if(d.contains(cities[i].toLowerCase())){
                    d.remove(cities[i].toLowerCase());
                    d.addLast(cities[i].toLowerCase());
                    answer++;
                }
                else{
                    d.removeFirst();
                    d.addLast(cities[i].toLowerCase());
                    answer+=5;
                }
            }
        }
        return answer;
    }
}