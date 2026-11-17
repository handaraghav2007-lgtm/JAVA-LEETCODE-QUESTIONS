class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MAX_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }        
         boolean negative = (dividend <0) != (divisor <0);

         if (dividend > 0) {
            dividend = - dividend;
        
         }
          if (divisor > 0) {
            divisor = -divisor;
        }
         int count = 0;

         while (dividend <= divisor) {
            dividend = dividend - divisor;
            count++;
        }
        return negative ? -count : count;

    }

}
