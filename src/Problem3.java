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

    public static Double solve(){
        Double answer = 0.0;

        ArrayList<Long> multiples = generateMultiples(TESTING_NUMBER);
        System.out.println(multiples);

        Set<Long> primeNumbersList = new HashSet<Long>();
        for (Long multiple : multiples){
            if (isPrime(multiple)){
                primeNumbersList.add(multiple);
            }
        }

        System.out.println(primeNumbersList);

        if (!primeNumbersList.isEmpty()){
            Integer max = 0;
            Iterator i = primeNumbersList.iterator();
            while(i.hasNext()){
                Integer currentInt = (Integer)i.next();
                if (currentInt > max){
                   max = currentInt;
                }
            }
            System.out.println(max);
            answer = max.doubleValue();
        }
        return answer;
    }

    private static boolean isPrime(long n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    private static ArrayList<Long> generateMultiples(long num){
        ArrayList<Long> list = new ArrayList<Long>();

        ArrayList<Long> smallerNumbers = smallerNumbers(num);
        for (Long number: smallerNumbers){
            if (num % number == 0){
                list.add(number);
            }
        }


        return list;
    }

    private static ArrayList<Long> smallerNumbers(long num){
        ArrayList<Long> list = new ArrayList<Long>();

        for (long i=num; i>1; i--){
            list.add(i);
        }

        return list;
    }
}
