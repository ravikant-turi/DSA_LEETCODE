class Solution {
    public boolean isPowerOfTwo(int n) {
        // double x;
        // for(int i=0;i<=30;i++){
        //      x=Math.pow(2,i);
        //      if(x==n){
        //           return true;
        //      }
        // }
        // return false;


        //  method 2
         
         if(n<=0){
             return false;
         }
         return (n&(n-1))==0;
    }
}