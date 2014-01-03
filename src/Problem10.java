import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 12/28/13
 * Time: 5:43 PM
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class Problem10 {

    private final static Integer TWO_MILLION = 2000000;

    public static Integer solve(){

        Integer primeCounter = 0;
        Integer potentialPrimeCandidate = 0;
        List<Integer> primes = new ArrayList<Integer>();

        while(primeCounter < TWO_MILLION){
           if (isPrime(potentialPrimeCandidate)){
               primeCounter++;
               primes.add(potentialPrimeCandidate);
           }
            potentialPrimeCandidate++;
        }

        Integer sum = 0;
        for (Integer number: primes){
            sum += number;
        }

        System.out.println(sum);


        return 0;
    }

    private static boolean isPrime(Integer number){

        if (number < 2){
            return false;
        }

        Integer root = (int) Math.sqrt(number);

        for (int i=2; i<=root; i++){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }
}
