public class IsAPrimeNumber {
    /*
        This function returns true when the given number is a prime number
     */
    public static boolean isAPrimeNumber(long num) {
        // DO NOT change the function name, return type, and parameter(s).
        /*
         * Prime num can only be divided by 1 and the num itself
         */
        for (int i = 2; i < num ; i++) {
            if(num%i == 0){
                return false;
            }

        }


        return true; // TODO: placeholder. To be replace with real code.
    }
}
