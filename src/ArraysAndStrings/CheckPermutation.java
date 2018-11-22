package ArraysAndStrings;

public class CheckPermutation {
    public static void main(String[] args) {
        String firstString = "Mother";
        String secondString = "mother";
        System.out.println("Permutation test: " + permutation(firstString, secondString));
    }
    public static String sort (String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    public static boolean permutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }
}
