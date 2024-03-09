import java.util.*;
class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        int start=0;
        int end=distance;
        int[] rocks2;
        rocks2 = Arrays.copyOf(rocks, rocks.length + 1);  //돌들에 distance도 추가한다.
        rocks2[rocks2.length - 1] = distance;
        Arrays.sort(rocks2);  //일단 돌들을 정리한다.

        while(start<=end){
            int mid=(start+end)/2;     //범위의 가운데를 가장 짧은 거리로 가정한다.
            int count=0; //삭제한 바위 개수를 센다.
            int prev=0;  //제거할 이전바위

            for(int i:rocks2){
                if(i-prev<mid){   //거리가 기준보다 작으면 삭제한다.
                    count+=1;    //삭제한 바위개수
                }
                else{
                    prev=i; //이전위치 기록
                }
            }
            if(count>n){
                end=mid-1;
            }
            else{
                answer=mid;
                start=mid+1;
            }
        }
        return answer;
    }
        
}