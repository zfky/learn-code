import java.util.HashSet;

public class Jz38 {
}
class Solution38 {
    HashSet<String> hashSet = new HashSet<>();
    public String[] goodsOrder(String goods) {
        char[] array = goods.toCharArray();
        f(array,0);
        return hashSet.toArray(new String[0]);
    }
    public void f(char[] c, int cur) {
        if (cur == c.length-1) {
            hashSet.add(String.valueOf(c));
        }
        for (int i=cur; i<c.length; i++) {
            swap(c,cur,i);
            f(c,cur+1);
            swap(c,i,cur);
        }
    }
    public void swap(char[] c, int i, int j) {
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }
}