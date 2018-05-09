
import java.util.Arrays;
public class P19 {
    public static void main(String[] args) {

        int[] sir = { 1, 2, 3, 4, 5,7,8,9,10 };
        int n = sir.length;

        int[] a = new int[(n + 1)/2];
        int[] b = new int[n - a.length];

        for (int i = 0; i < n; i++)
        {
            if (i < a.length)
                a[i] = sir[i]*2;
            else
                if (i%2==0)
                b[i - a.length] = sir[i];
            else
                    b[i - a.length] = sir[i]*3;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
