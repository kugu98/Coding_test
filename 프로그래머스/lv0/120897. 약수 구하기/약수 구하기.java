import java.util.ArrayList;
class Solution {
    public ArrayList solution(int n) {

        ArrayList list=new ArrayList();
        for (int i=1;i<n+1;i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}