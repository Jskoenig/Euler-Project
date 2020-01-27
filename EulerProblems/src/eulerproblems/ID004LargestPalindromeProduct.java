/*
 * Revision History (Newest first)
 * 
 */

package eulerproblems;
import java.util.Objects;
/**
 *
 * @author JSKoenig
 */
public class ID004LargestPalindromeProduct {
    
    /*
    Problem #4
    A palindromic number reads the same both ways. The largest palindrome made 
    from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest 
    palindrome made from the product of two 3-digit numbers.
    */
    
    public void largestPalindromeProduct(){
        
        Integer palindrome = 0;
        
        for(int i = 999; i > 900; i--){
            for(int p = 999; p > 900; p--){
                
                Integer value = i * p;
                
                StringBuilder stringReversal = new StringBuilder();
                stringReversal.append(value);
                stringReversal.reverse();
                
                Integer reversedValue = Integer.parseInt(stringReversal.toString());
                
                if(Objects.equals(value, reversedValue)){
                    if(palindrome < value){
                        palindrome = value;
                    }
                }
            }
        }
        if(palindrome != 0){
            System.out.println(palindrome);
        } else {
            System.out.println("No palindrome found");
        }

    }
}