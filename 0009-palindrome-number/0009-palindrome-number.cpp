class Solution {
public:
    bool isPalindrome(int x) {
     
     int copy,r;
     unsigned int num=0;
   copy=x;
      while(x>0){
           r=x%10;
         num=(num*10)+r;
           x=x/10;
      }  
      if(num==copy){
          return true;
      }
      else if(copy<0){
          return false;
      }
      else {
          return false;
      }
    }
};