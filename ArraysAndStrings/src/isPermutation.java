import java.util.Arrays;

public class isPermutation {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "olleh";
        String s3 = "noo";
        String s4 = "no";


        System.out.println(isPermutation(s1,s2));
        System.out.println(isPermutation(s3,s4));
    }

    public static String sortString(String s)
    {
        // need to sort string, convert string into char array and sort it, then convert to string again
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static boolean isPermutation(String s1, String s2)
    {
        //base case
        if(s1.length() != s2.length())
            return false;

        return(sortString(s1).equals(sortString(s2)));
    }

}
