package Leetcode;

public class day1 {
    public static void main(String[] args) {

        public boolean isPalindrome(int x) {
            if(x<0){
                return false;
    
            }
            int n=x;
            int revNum = 0;
            while(n>0){
                int digit =n%10;
                revNum =revNum*10+digit;
                n=n/10;
    
            }
    
        }

    }
}
