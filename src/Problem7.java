import java.util.*;

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
        Integer answer;
        Integer primeCounter = 0;
        Integer potentialPrimeCandidate = 0;

        List<Integer> primes =  new ArrayList<Integer>();
        while(primeCounter < LIMIT){
            if (isPrime(potentialPrimeCandidate)){
                primes.add(potentialPrimeCandidate);
                primeCounter++;
            }
            potentialPrimeCandidate++;
        }

        answer = Collections.max(primes);
        return answer;
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
