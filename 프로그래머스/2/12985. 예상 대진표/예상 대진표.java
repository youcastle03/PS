class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        while(n!=2){
            if(a%2==0){
                a/=2;    
            }
            else{
                a=a/2+1;
            }
            if(b%2==0){
                b/=2;    
            }
            else{
                b=b/2+1;
            }
            
            if(a==b){
                break;
            }
            answer++;
            n/=2;
        }
        return answer;
    }
}