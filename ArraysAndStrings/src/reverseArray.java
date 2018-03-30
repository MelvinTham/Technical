
import java.util.Arrays;
public class reverseArray {

    public static void main(String[] args)
    {
        int arr [] = {1,2,3,4};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int array[]){
        for (int start = 0 , end = array.length -1; start <= end; start++ ,end--)
        {
            int tmp =array[start];
            array[start] = array[end];
            array[end] = tmp;

        }

    }



}
