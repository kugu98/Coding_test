class Solution {
    public String solution(String rsp) {
        String answer = "";
        int [] so=new int[rsp.length()];
        for(int i=0;i<rsp.length();i++){
            so[i]=rsp.charAt(i)-'0';
        }
        for(int i=0;i<rsp.length();i++){
            switch(so[i]){
                case 2:
                    answer=answer+"0";
                    break;
                case 0:
                    answer=answer+"5";
                    break;
                case 5:
                    answer=answer+"2";
                    break;
            }
        }
        return answer;
    }
}