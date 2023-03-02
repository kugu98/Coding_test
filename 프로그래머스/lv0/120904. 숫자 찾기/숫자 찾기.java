import java.util.stream.Stream;
class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int[] arr = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==k){
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}