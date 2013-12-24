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

        System.out.println(isPalindrome(90119));

        return 0.0;
    }

    private static boolean isPalindrome(Integer number){

        boolean palindrome = false;
        String stringNumber = number.toString();
        char[] numberArray = stringNumber.toCharArray();

        if (numberArray != null){
            char firstInt = numberArray[0];
            char secondInt = numberArray[1];
            char thirdInt = numberArray[2];
            char fourthInt = numberArray[3];
            char fifthInt = numberArray[4];

            //check if the number is even or odd
            if (numberArray.length % 2 == 0)        {
                //then it must be of length 6
                char sixthInt = numberArray[5];
                if (firstInt == sixthInt && secondInt == fifthInt && thirdInt == fourthInt){
                    palindrome = true;
                }

            } else {
                //then it must be of length 5

                if (firstInt == fifthInt && secondInt == fourthInt){
                    palindrome = true;
                }
            }


            for (int i=0; i<numberArray.length;i++){
                System.out.println(numberArray[i]);

            }

            System.out.println(numberArray);
        } else {
            System.err.println("Array is null");
        }





        return palindrome;
    }
}
