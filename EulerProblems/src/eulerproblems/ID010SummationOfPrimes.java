/*
 * Revision History (Newest first)
 * 
 */
package eulerproblems;

/**
 *
 * @author JSKoenig
 */
public class ID010SummationOfPrimes {

    /*
    Problem #10
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    Find the sum of all the primes below two million.
     */
    
    public void summationOfPrimes() {
        long summation = 0;
        long prime = 1;
        for (int i = 0; i < 2000000; i++) {
            prime++;
            if (isPrime(prime)) {
                summation += prime;
            }
        }
        System.out.println(summation);
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        }
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
