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
    private final static Integer TWO = 2;

    public static Integer solve(){

        Integer answer  = 0;
        Integer primeCounter = 0;
        Integer potentialPrimeCandidate = 3;

        Set<Integer[]> candidates = new HashSet<Integer[]>();

        Integer number =3;
        List<Integer> primes = new ArrayList<Integer>();
        while(primes.size() <= LIMIT) {

            Integer[] list = generateListOfIntegersBetweenTwoAndNumber(number);

            Set<Integer> composites = new HashSet<Integer>();
            for (int i = 0; i <= list.length - 1; i++) {
                System.out.print(list[i] + " ");

                Integer increment = list[i];

                //cross out every index whose value is evenly divisible by that number (in increments of that number)
                for (int j = increment + increment; j <= number; j += increment) {
                    if (j % increment == 0) {
//                     System.out.println(j + " " + increment);
                        composites.add(j);
                    }
                }

            }
            System.out.println(composites);

            for (int j = 0; j <= list.length - 1; j++) {
                if (!composites.contains(list[j])) {
                    primes.add(list[j]);
                }
            }

            System.out.println(primes);
            number++;
        }



//        System.out.println(answer);
        return 0;
    }

    private static Integer[] generateListOfIntegersBetweenTwoAndNumber(Integer number){
        Integer sizeOfList = number - 1;  //starting from 2 up to AND including number
        Integer[] list = null;

        if (number == null){
            System.err.println("Number cannot be null");
        }

        //must be greater than 2 because 2 is the first prime number
        if (number > 2){
            list = new Integer[sizeOfList];

            //populate list with values from 2 until that number
            for (int i=0; i<=list.length-1; i++){
                list[i] = i+2;
            }
        } else {
            System.err.println("Number must be greater than 2");
        }

        return list;
    }
}
