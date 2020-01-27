/*
 * Revision History (Newest first)
 * 
 */

package eulerproblems;

/**
 *
 * @author JSKoenig
 */
public class ID009SpecialPythagoreanTriplet {
    
    /*
    Problem #9
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
    a^2 + b^2 = c^2 For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.
    */
    
    public void specialPythagoreanTriplet(){
        
        int aSquare = 1;
        int bSquare = 1;
        int cSquare = 1;
        
        for(int a = 1; a < 500; a++){
            for(int b = a + 1; b < 500; b++){
                aSquare = (b * b) - (a * a);
                bSquare = 2 * b * a;
                cSquare = (a * a) + (b * b);
                
                if(aSquare + bSquare + cSquare == 1000){
                    System.out.println(aSquare * bSquare * cSquare);
                }
            }
        }
    }
}