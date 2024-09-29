class Solution {
    public int numberOfSteps(int num) {
       
           return divide(num,0);
       }
    private int divide(int num, int c){
        if(num ==0){
            return c;
        }
        int rem = num%2;
        if (rem ==0){
            return divide(num/2,c+1);
        }
        else{
           
            return divide(num-1,c+1);
        }
    }
    }
