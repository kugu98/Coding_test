import java.util.stream.Stream;
class Solution {
    public int solution(int order) {
        int answer = 0;
        int[] arr = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();

        for(int i=0;i< arr.length;i++){
            if(arr[i]%3==0  && arr[i]>0){
                answer=answer+1;
            }
        }

        return answer;
    }
}