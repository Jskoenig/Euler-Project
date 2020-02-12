/*
 * Revision History (Newest first)
 * 
 */

package eulerproblems;

/**
 * @author JSKoenig
 */
public class EulerProblems {

    /**
     * Creates an object of each problem then runs it. All data for each problem is hard 
     * coded into their specific Java file.
     */
    public void run(){
        final long startTime = System.nanoTime();
        
        long problemTime = System.nanoTime();        
        ID001MultiplesOf3And5 problem001 = new ID001MultiplesOf3And5(); //done
        System.out.println("ID001");
        System.out.println("Multiples Of 3 And 5");
        problem001.multiplesOf3And5();
        System.out.println((System.nanoTime() - problemTime) / 1000000 + " milliseconds to execute.");
        System.out.println();
        
        problemTime = System.nanoTime();
        ID002EvenFibonacciNumbers problem002 = new ID002EvenFibonacciNumbers(); //done
        System.out.println("ID002");
        System.out.println("Even Fibonacci Numbers");
        problem002.evenFibonacciNumbers();
        System.out.println((System.nanoTime() - problemTime) / 1000000 + " milliseconds to execute.");
        System.out.println();
        
        problemTime = System.nanoTime();
        ID003LargestPrimeFactor problem003 = new ID003LargestPrimeFactor(); //done
        System.out.println("ID003");
        System.out.println("Largest Prime Factor");
        problem003.largestPrimeFactor();
        System.out.println((System.nanoTime() - problemTime) / 1000000 + " milliseconds to execute.");
        System.out.println();
        
        problemTime = System.nanoTime();
        ID004LargestPalindromeProduct problem004 = new ID004LargestPalindromeProduct(); //done
        System.out.println("ID004");
        System.out.println("Largest Palindrome Product");
        problem004.largestPalindromeProduct();
        System.out.println((System.nanoTime() - problemTime) / 1000000 + " milliseconds to execute.");
        System.out.println();
        
        problemTime = System.nanoTime();
        ID005SmallestMultiple problem005 = new ID005SmallestMultiple(); //done
        System.out.println("ID005");
        System.out.println("Smallest Multiple");
        problem005.smallestMultiple();
        System.out.println((System.nanoTime() - problemTime) / 1000000 + " milliseconds to execute.");
        System.out.println();
        
        problemTime = System.nanoTime();
        ID006SumSquareDifference problem006 = new ID006SumSquareDifference();  //done
        System.out.println("ID006");
        System.out.println("Sum Square Difference");
        problem006.sumSquareDifference();
        System.out.println((System.nanoTime() - problemTime) / 1000000 + " milliseconds to execute.");
        System.out.println();
        
        problemTime = System.nanoTime();
        ID00710001stPrime problem007 = new ID00710001stPrime();  //done
        System.out.println("ID007");
        System.out.println("10001st Prime");
        problem007.x10001stPrime();
        System.out.println((System.nanoTime() - problemTime) / 1000000 + " milliseconds to execute.");
        System.out.println();
        
        problemTime = System.nanoTime();
        ID008LargestProductInASeries problem008 = new ID008LargestProductInASeries();  //done
        System.out.println("ID008");
        System.out.println("Largest Product In A Series");
        problem008.largestProductInASeries();
        System.out.println((System.nanoTime() - problemTime) / 1000000 + " milliseconds to execute.");
        System.out.println();
        
        ID009SpecialPythagoreanTriplet problem009 = new ID009SpecialPythagoreanTriplet();  //done
        System.out.println("ID009");
        System.out.println("Special Pythagorean Triplet");
        problem009.specialPythagoreanTriplet();
        System.out.println((System.nanoTime() - problemTime) / 1000000 + " milliseconds to execute.");
        System.out.println();
        
        problemTime = System.nanoTime();
        ID010SummationOfPrimes problem010 = new ID010SummationOfPrimes();  //done
        System.out.println("ID010");
        System.out.println("Summation Of Primes");
        problem010.summationOfPrimes();
        System.out.println((System.nanoTime() - problemTime) / 1000000 + " milliseconds to execute.");
        System.out.println();

        System.out.println("Program finished.");
        System.out.println("Total time to execute " + (System.nanoTime() - startTime) / 1000000 + " milliseconds.");
    }
    
    /**
     * Creates new instance of EulerProblems and runs the program.
     * @param args
     */
    public static void main(String[] args) {
        EulerProblems driver = new EulerProblems();
        driver.run();
    }
    
}
