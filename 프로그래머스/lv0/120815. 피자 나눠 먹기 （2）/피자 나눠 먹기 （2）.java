class Solution {
    public int solution(int n) {
        int result=gcd(n,6);
        int mul=n*6/result;
        int answer = mul/6;
        
        return answer;
    }
    public static int gcd(int a, int b) {
		if(a%b == 0) {
			return b;
		}
		return gcd(b, a%b);
	}
}