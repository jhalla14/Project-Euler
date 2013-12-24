import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 9/7/13
 * Time: 9:51 PM
 * To change this template use File | Settings | File Templates.
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {



    public static Double solve(){
        Double answer = 0.0;
        for (int i=0;i<1000;i++){
            if ((i %3 == 0) || (i%5 == 0)){
              answer += i;
            }
        }
        return  answer;
    }


}
