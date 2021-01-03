/*367. Valid Perfect Square
Easy

1064

185

Add to List

Share
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

 

Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false
 

Constraints:

1 <= num <= 2^31 - 1*/
//Solution
class Solution {
    public boolean isPerfectSquare(int num) {
        long low=0,high=num,mid=0,square;
        if(num==1)return true;
        while(low<=high){
            mid=low + (high-low)/2;
            square = mid*mid;
            if(square==num) return true;
            else if(square>num) high = mid-1;
            else if(square<num) low = mid+1;
        }
        return false;
    }
}