/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 9/7/13
 * Time: 11:19 PM
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */
public class Problem2 {

    private static Double FOUR_MILLION = 4000000.00;

    public static Double solve(){
        Double answer = 0.0;

       int fib = 0;
       int fib1 = 1;
       int fib2 = 2;


        while(fib < FOUR_MILLION){
            //add the fibonacci numbers from the previous two
            fib = fib1 + fib2;
            if(fib % 2 == 0){
                answer += fib;
            }
//            System.out.println(fib);

            //save 2nd term as the new 1st term
            fib1 = fib2;

            //the 2nd term is now the older fibonacci number
            fib2 = fib;

        }

        return answer;
    }
}
