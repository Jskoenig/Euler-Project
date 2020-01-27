/*
 * Revision History (Newest first)
 * 
 */

package eulerproblems;

/**
 *
 * @author JSKoenig
 */
public class ID001MultiplesOf3And5 {

    /*
    Problem #1
    If we list all the natural numbers below 10 that are multiples of 3 or 5, 
    we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.
     */
    
    public void multiplesOf3And5(){
        final int total = 1000;
        int multipleOfX = 0;
        for (int i = 0; i < total; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multipleOfX += i;
            }
        }
        System.out.println(multipleOfX);
    }
}