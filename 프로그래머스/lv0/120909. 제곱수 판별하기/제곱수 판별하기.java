class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        while(i<n){
            if(i==n/i && n%i==0){
                answer=1;
                break;
            }else{
                answer=2;
            }
            i++;
        }
        return answer;
    }
}