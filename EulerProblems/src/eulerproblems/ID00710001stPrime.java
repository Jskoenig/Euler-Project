/*
 * Revision History (Newest first)
 * 
 */
package eulerproblems;

/**
 *
 * @author JSKoenig
 */
public class ID00710001stPrime {

    /*
    Problem #7
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see 
    that the 6th prime is 13. What is the 10001st prime number?
     */
    public void x10001stPrime() {
        int numberOfPrimes = 0;
        long prime = 1;
        while (numberOfPrimes < 10001) {
            prime++;
            if (isPrime(prime)) {
                numberOfPrimes++;
            }
        }
        System.out.println(prime);
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
