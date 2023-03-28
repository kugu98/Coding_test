import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        int[] result = new int[n];
        int[] count = new int[1000001]; // 입력값의 범위가 1 이상 1,000,000 이하이므로 배열 크기를 1,000,001로 설정

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            count[nums[i]]++; // 각 숫자가 나타난 횟수를 계산하여 배열에 저장
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && count[nums[stack.peek()]] < count[nums[i]]) {
                result[stack.pop()] = nums[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.print(sb);
    }
}