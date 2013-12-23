import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 12/23/13
 * Time: 11:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class Problem5 {

    private static int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

    public static int solve(){
        int number = 1;
        int result = 0;
        while (number < Integer.MAX_VALUE){
            System.out.println(number);
               if (number % numbers[0] == 0 && number % numbers[1] == 0 && number % numbers[2] == 0 && number % numbers[3] == 0
                       && number % numbers[4] == 0 && number % numbers[5] == 0 && number % numbers[6] == 0 && number % numbers[7] == 0
                       && number % numbers[8] == 0 && number % numbers[9] == 0 && number % numbers[10] == 0 && number % numbers[11] == 0
                       && number % numbers[12] == 0 && number % numbers[13] == 0 && number % numbers[14] == 0 && number % numbers[15] == 0
                       && number % numbers[16] == 0 && number % numbers[17] == 0 && number % numbers[18] == 0 && number % numbers[19] == 0){
                   result = number;
                   break;
               }

            number++;
        }
        return result;
    }
}
