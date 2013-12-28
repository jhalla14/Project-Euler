import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 12/24/13
 * Time: 3:50 PM
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10,001st prime number?
 */
public class Problem7 {

    private final static Integer LIMIT = 10001;

    public static Integer solve(){

        Integer answer  = 0;
        Integer primeCounter = 0;
        Integer number = 0;
        while(primeCounter <= LIMIT){
            //check if number is a multiple of 2
            if (!(number % 2 == 0)){
                //if not, then check the odd numbers
                for (int i = 3; i*i <=number-1; i += 2) {
                    if (number % i == 0)
                        primeCounter++;
                        answer = number;
                }
            }

            number++;
        }


        System.out.println(answer);
        return 0;
    }
}
