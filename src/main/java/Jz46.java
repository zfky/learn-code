public class Jz46 {
}
class Solution46 {
    public int f(String nums,int i){
        // 最后一位为0的情况
        if((i == nums.length()-1)&&nums.charAt(i)=='0'){
            return 0;
        }
        else if(i >= nums.length()-1){ // 字符串遍历结束
            return 1;
        }
        if(nums.charAt(i) == '0'){
            return 0;
        }
        else if(nums.charAt(i) > '2' || (nums.charAt(i) == '2' && nums.charAt(i+1) > '6')){
            return f(nums,i+1);
        }
        else{
            return f(nums,i+1) + f(nums,i+2);
        }
    }
    public int solve (String nums) {
        return f(nums,0);
    }
}
