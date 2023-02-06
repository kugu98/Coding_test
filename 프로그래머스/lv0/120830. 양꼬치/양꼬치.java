class Solution {
    public int solution(int n, int k) {
        int discount;
        int answer ;
        if(n>=10){
            discount=n/10;
            answer=n*12000+k*2000-discount*2000;
        }else{
            answer=answer=n*12000+k*2000;
        }
        return answer;
    }
}