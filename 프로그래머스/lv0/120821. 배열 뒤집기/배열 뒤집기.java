class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j=num_list.length;
        for(int i=0;i< num_list.length;i++){
            answer[i]=num_list[j-1-i];
        }
        return answer;
    }
}