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

    public static Double solve(){

        ArrayList<ArrayList<Integer>> beta = new ArrayList<ArrayList<Integer>>();

//        for (int i=1; i<=numbers.length; i++){
//            beta.add(generateMultiples(i));
//        }
//
//        System.out.println(beta);
//        System.out.println(beta.size());

        int number = 1;
        int sigma = 0;
        while (number < Integer.MAX_VALUE){
            System.out.println(number);
               if (number % numbers[0] == 0 && number % numbers[1] == 0 && number % numbers[2] == 0 && number % numbers[3] == 0
                       && number % numbers[4] == 0 && number % numbers[5] == 0 && number % numbers[6] == 0 && number % numbers[7] == 0
                       && number % numbers[8] == 0 && number % numbers[9] == 0 && number % numbers[10] == 0 && number % numbers[11] == 0
                       && number % numbers[12] == 0 && number % numbers[13] == 0 && number % numbers[14] == 0 && number % numbers[15] == 0
                       && number % numbers[16] == 0 && number % numbers[17] == 0 && number % numbers[18] == 0 && number % numbers[19] == 0){
                   sigma = number;
                   break;
               }

            number++;
        }

        System.out.println("Sigma: " + sigma);

        return 0.0;
    }

    private static ArrayList<Integer> generateMultiples(int num){
        ArrayList<Integer> list = new ArrayList<Integer>();

        ArrayList<Integer> smallerNumbers = smallerNumbers(num);
//        System.out.println("Smaller Numbers list: " +smallerNumbers);

        for (Integer number: smallerNumbers){
              if (num % number == 0){
                  list.add(number);
              }
        }


        return list;
    }

    private static ArrayList<Integer> smallerNumbers(int num){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=num; i>1; i--){
            list.add(i);
        }

        return list;
    }
}
