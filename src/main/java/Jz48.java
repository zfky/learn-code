import java.util.LinkedList;
import java.util.Queue;

public class Jz48 {
}
class Solution48 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @return int整型
     */
    public int lengthOfLongestSubstring (String s) {
        // write code here
        int max = 0;
        if (s == null || "".equals(s)) {
            return 0;
        }
        Queue<Character> que = new LinkedList<>();
        for (int i=0;i<s.length();i++) {
            while (que.contains(s.charAt(i))) {
                que.remove();
            }
            que.add(s.charAt(i));
            max = Math.max(max, que.size());
        }
        return max;

    }
}