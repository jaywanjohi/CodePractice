package ArraysAndStrings;

public class IsUnique {
    public static void main(String[] args) {
        String test = "Anthony";
        System.out.println("Uniqueness test: " + isUniqueChars(test));
    }
    private static boolean isUniqueChars(String str){
        // Assuming string can have characters a-z
        // this has 32 bits set to 0
        int checker = 0;
        for (int i = 0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            System.out.println(val);
            // if that bit is already set in checker,
            // return false
            if ((checker & (1 << val)) > 0) { //<< - shift bit pattern to the left
                return false;
            }
            // otherwise update and continue by
            // setting that bit in the checker
            checker |= (1 << val);
        }
        // no duplicates encountered, return true
        return true;
    }
}
