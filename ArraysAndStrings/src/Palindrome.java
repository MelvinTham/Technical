import java.util.Arrays;
public class Palindrome{

    public static void main(String[] args)
    {
        char arr [] = {'a','n','a'};
        String pal = "level";
        String pal1 = "WrongAnswer";
        System.out.println(Palindrome(arr));
        System.out.println(Palindrome1(pal));
        System.out.println(Palindrome1(pal1));
    }
// Palindrome method for arrays. Does not account for upper case.

    public static boolean Palindrome( char [] arr )
    {
        int start = 0;
        int end = arr.length-1;

        for (int i =0; i<arr.length;i++)
        {
            if(arr[start] != arr[end])
            {
                return false;
            }
            else
            {
                start++;
                end--;
            }
        }
            return true;
    }
// Palindrome method for Strings. Does not account for upper case.
    public static boolean Palindrome1(String str)
    {
      int start = 0;
      int end = str.length()-1;

      for (int i = start; i<end;i++){
          if (str.charAt(start) != str.charAt(end)){
              return false;
          }
          else {
              start++;
              end--;
          }
      }
        return true;
    }
}
