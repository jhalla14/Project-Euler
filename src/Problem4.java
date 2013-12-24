/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 12/23/13
 * Time: 11:16 AM
 * To change this template use File | Settings | File Templates.
 */
/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {



    public static Double solve(){

        System.out.println(isPalindrome(9009));

        return 0.0;
    }

    private static boolean isPalindrome(Integer number){

        String stringNumber = number.toString();
        char[] numberArray = stringNumber.toCharArray();

        for (int i=0; i<numberArray.length;i++){
           System.out.println(numberArray[i]);

        }

        System.out.println(numberArray);

        return true;
    }
}
