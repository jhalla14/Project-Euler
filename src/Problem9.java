/**
 * Created with IntelliJ IDEA.
 * User: Joshua Hall
 * Date: 12/28/13
 * Time: 4:01 PM
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
    a2 + b2 = c2
    For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.
 */
public class Problem9 {

    public static Integer solve(){

        Integer product = 0;
        Boolean found = false;

        for (int m=2; m<=Integer.MAX_VALUE; m++){

            for (int n=1; n<m; n++){
                Integer a = (m*m) - (n*n);
                Integer b = (2*m*n);
                Integer c = (m*m) + (n*n);

                if (a+b+c == 1000){
                    product = a*b*c;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        return product;
    }
}
