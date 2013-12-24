import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 9/8/13
 * Time: 4:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem3 {

    private static int TRAINING_NUMBER = 13195;
    private static long TESTING_NUMBER = 600851475143l;

    public static int solve(){


        return generateMultiples(TESTING_NUMBER);
    }


    private static int generateMultiples(Long num){

        int divisor;

        //try dividing by every number starting at 2 because everything is divisible by 1
        for (divisor = 2; divisor <= num; divisor++) {
            //if it is evenly divisible
            if (num % divisor == 0) {
                //divide the current number by that factor (to break it down)
                //and keep finding more factors
                num = num / divisor;
            }
        }

        return divisor;
    }

}
