import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
    int answer=0;
		int boat=0;
		Arrays.sort(people);
		int i=0;
		int reverse=people.length-1;
        int count=0;
		while(reverse>=i) {
			if(boat>=people[reverse]) {
				if(count==2){
                    count=1;
                    answer++;
                    boat=limit;
                    boat-=people[reverse];
                    reverse--;
                }
                else{
                    boat-=people[reverse];
				    reverse--;
                    count++;
                }
                
			}
			else if(boat>=people[i]) {
				if(count==2){
                    count=1;
                    answer++;
                    boat=limit;
                    boat-=people[i];
                    i++;
                }
                else{
                    boat-=people[i];
				    i++;
                    count++;
                }
			}
			else {
				answer++;
				boat=limit;
				boat-=people[reverse];
				reverse--;
                count++;
			}
		}
		return answer;
    }
}