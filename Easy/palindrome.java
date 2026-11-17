import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }


        int ori_no = x;
        int rev_no = 0;
        
        while(x>0){
            int last_dig = x % 10;
            rev_no = rev_no*10 + last_dig;
            x=x/10;
        }
        return ori_no == rev_no;
    }


        
}
