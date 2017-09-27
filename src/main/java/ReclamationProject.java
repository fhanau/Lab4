/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 *
 * @author  me
 */
public class ReclamationProject {

    /*
     * Sleeps. A lot.
     * @param a does work.
     * @param b also does work.
     */
    static String doit(final String aa, final String bb) {
        String a = aa;
        String b = bb;
        if (a.length() > b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    }
                }
            } // Ah yeah
        } return r; }

    /**
     * Sleeps. A lot. Too.
     * @param args Ignored.
     */
    public static void main(final String[] args) {

    }
}
