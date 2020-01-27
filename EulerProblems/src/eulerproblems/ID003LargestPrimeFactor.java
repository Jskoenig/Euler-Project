/*
 * Revision History (Newest first)
 * 
 */
package eulerproblems;

/**
 *
 * @author JSKoenig
 */
public class ID003LargestPrimeFactor {

    /*
    Problem #3
    The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime 
    factor of the number 600851475143 ?
     */
    
    public void largestPrimeFactor() {
        long num = 600851475143L;
        while (num % 2 == 0) {
            num /= 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                num /= i;
            }
        }
        if (num > 2) {
            System.out.println(num);
        }
    }
}
