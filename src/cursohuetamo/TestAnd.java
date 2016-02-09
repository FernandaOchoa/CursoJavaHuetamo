
package cursohuetamo;

/**
 *
 * @author monsh
 */
public class TestAnd {

    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = false;

        //demostrate &&
        test = (i > 10) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);

        //demostrate &
        test = (i > 10) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }

}
