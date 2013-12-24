/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 12/24/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
/*
    The sum of the squares of the first ten natural numbers is,
    1^2 + 2^2 + ... + 10^2 = 385
    The square of the sum of the first ten natural numbers is,
    (1 + 2 + ... + 10)2 = 552 = 3025
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {

    private final static Integer ONE = 1;
    private final static Integer TEN = 10;
    private final static Integer ONE_HUNDRED = 100;

    public static Double solve(){
        Double answer;

        Integer[] naturalNumbersArray = createArray(ONE_HUNDRED);

        Integer sumOfSquares = 0;
        Integer sum = 0;

        for (int i=1; i<=naturalNumbersArray.length-1;i++){
            sumOfSquares += (naturalNumbersArray[i] * naturalNumbersArray[i]);
            sum += naturalNumbersArray[i];
        }

        Double squareOfSums = Math.pow(sum,2);
        answer = squareOfSums - sumOfSquares;

        return answer;
    }

    private static Integer[] createArray(int size){

        if (size == 0){
            System.err.println("Array size is 0");
        }

        Integer[] array = new Integer[size+1];

        //starting from 1, not 0
        for (int i=1; i<=size; i++){
            array[i] = i;
        }


        return array;
    }

}
