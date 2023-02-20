import java.util.Arrays;


class Solution {
    public int[] solution(String my_string) {
        
        
        String solution=my_string.replaceAll("[^0-9]","");
        String [] arr=solution.split("");
        int[] answer = new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            answer[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}