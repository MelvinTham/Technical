
public class isUnique {

    public static void main(String[] args) {
        String hello = "hello";  // false
        String test ="helo";      // true
        System.out.println(isUnique(hello));
        System.out.println(isUniqueNoDs(test));
    }
    //With DS

    public static boolean isUnique(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] arr = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);

            if (arr[value])
                return false;
            else
            arr[value] = true;
        }
        return true;
    }

        // without Ds
    public static boolean isUniqueNoDs(String str) {
        for(int i = 0; i<str.length(); i++){
            for(int j = i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }

            }
        }
        return true;
    }


}





