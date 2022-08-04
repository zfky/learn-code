public class Jz4 {
    public static void main(String[] args) {
        int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target1 = 7;
        int target2 = 3;
        Solution solution = new Solution();
        System.out.println("7: " + solution.Find(target1,array) );
        System.out.println("3: " + solution.Find(target2,array) );
    }
}
class Solution {
    public boolean Find(int target, int [][] array) {
        int i=0,j=array[0].length-1;
        while(i<array.length&&j>=0){
            if(array[i][j]==target)
                return true;
            else if(array[i][j]>target)
                j--;
            else
                i++;
        }
        return false;
    }
}
