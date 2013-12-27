import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 12/24/13
 * Time: 5:30 PM
 * Find the greatest product of five consecutive digits in the 1000-digit number.
     73167176531330624919225119674426574742355349194934
     96983520312774506326239578318016984801869478851843
     85861560789112949495459501737958331952853208805511
     12540698747158523863050715693290963295227443043557
     66896648950445244523161731856403098711121722383113
     62229893423380308135336276614282806444486645238749
     30358907296290491560440772390713810515859307960866
     70172427121883998797908792274921901699720888093776
     65727333001053367881220235421809751254540594752243
     52584907711670556013604839586446706324415722155397
     53697817977846174064955149290862569321978468622482
     83972241375657056057490261407972968652414535100474
     82166370484403199890008895243450658541227588666881
     16427171479924442928230863465674813919123162824586
     17866458359124566529476545682848912883142607690042
     24219022671055626321111109370544217506941658960408
     07198403850962455444362981230987879927244284909188
     84580156166097919133875499200524063689912560717606
     05886116467109405077541002256983155200055935729725
     71636269561882670428252483600823257530420752963450
 */
public class Problem8 {

    private final static BigInteger BIG_INTEGER = new BigInteger(
            "73167176531330624919225119674426574742355349194934" +
            "96983520312774506326239578318016984801869478851843" +
            "85861560789112949495459501737958331952853208805511" +
            "12540698747158523863050715693290963295227443043557" +
            "66896648950445244523161731856403098711121722383113" +
            "62229893423380308135336276614282806444486645238749" +
            "30358907296290491560440772390713810515859307960866" +
            "70172427121883998797908792274921901699720888093776" +
            "65727333001053367881220235421809751254540594752243" +
            "52584907711670556013604839586446706324415722155397" +
            "53697817977846174064955149290862569321978468622482" +
            "83972241375657056057490261407972968652414535100474" +
            "82166370484403199890008895243450658541227588666881" +
            "16427171479924442928230863465674813919123162824586" +
            "17866458359124566529476545682848912883142607690042" +
            "24219022671055626321111109370544217506941658960408" +
            "07198403850962455444362981230987879927244284909188" +
            "84580156166097919133875499200524063689912560717606" +
            "05886116467109405077541002256983155200055935729725" +
            "71636269561882670428252483600823257530420752963450");


    public static Integer solve(){

        Set<Integer[]> productSet = new HashSet<Integer[]>();

        String bigStringInteger = BIG_INTEGER.toString();

        char[] bigStringArray = bigStringInteger.toCharArray();

        for (int i=0; i<=bigStringArray.length-5; i++){
            Integer number = Character.getNumericValue(bigStringArray[i]);

            Integer[] array = new Integer[5];

            for (int j=0; j<=4; j++){
                array[j] = Character.getNumericValue(bigStringArray[i+j]);
            }
            productSet.add(array);
        }


        //loop and find the highest product among all the sets
        Integer maxProduct = 0;
        Integer product;
        Iterator i = productSet.iterator();
        while (i.hasNext()){
            Integer[] set = (Integer[])i.next();
            product = set[0] * set[1] * set[2] * set[3] * set[4];

            if (product >= maxProduct){
                maxProduct = product;
            }
        }

        return maxProduct;
    }

}
