// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
//   5 4 3 1 10
 // 1,2,2,3,4,5 1 4 5 4 3 2
 // 1 2 3 4 5 2
 // 2 2 1 3 4 5   

 // 2 3 3 2 1 2 2 1 1 4 3 3 = 1 2 3 4 3 2 1  

Predict the length of the spike
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer,Integer> count = new HashMap<>();

        int max_val;
        max_val=A[0];
        for(int i=0;i<A.length;i++){
            
            if(max_val<A[i]){
                max_val=A[i];
            }
            if(count.containsKey(A[i])&&A[i]!=max_val){
                count.put(A[i],2);
            }
            else{
                count.put(A[i],1);
            }
        }
     //   System.out.print(max_val);
        int counter=0;
        for(Integer i:count.values()){
            counter+=i;
        }
        return counter;

    }
    
}
