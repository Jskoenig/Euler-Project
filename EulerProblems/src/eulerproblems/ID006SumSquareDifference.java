/*
 * Revision History (Newest first)
 * 
 */

package eulerproblems;

import java.util.*;
/**
 *
 * @author JSKoenig
 */
public class ID006SumSquareDifference {
    
    /*
    Problem #6
    The sum of the squares of the first ten natural numbers is, 
    1^2 + 2^2 + ... + 10^2 = 385 The square of the sum of the first ten natural 
    numbers is, (1 + 2 + ... + 10)^2 = 55^2 = 3025 
    Hence the difference between the sum of the squares of the first ten natural 
    numbers and the square of the sum is 3025 − 385 = 2640. Find the difference 
    between the sum of the squares of the first one hundred natural numbers and 
    the square of the sum.
    */
    public void sumSquareDifference(){
        long sumOfSquares = 0;
        long squareOfSums = 0;
        long total;
                
        for(long i = 0; i <= 100; i++){
            squareOfSums += i;
        }
        
        squareOfSums = (long)Math.pow(squareOfSums, 2);
        
        for(long i = 0; i <= 100; i++){
            long temp = i;
            temp = (long)Math.pow(temp, 2);
            sumOfSquares += temp;
        }
        
        total = squareOfSums - sumOfSquares;
        
        System.out.println(total);
    }
}