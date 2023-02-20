class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int i=1;
        while(code*i<=cipher.length()){
            answer=answer+cipher.charAt(code*i-1);
            i++;
        }
        return answer;
    }
}