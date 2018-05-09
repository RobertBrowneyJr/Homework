import java.util.Arrays;
public class P20 {

    public static void main(String args[]) {
        int[] sir = {1, 4, 5, 6, 7, 8,11,2};
        for(int i=0;i<sir.length-1;i++){
            if (sir[i]<sir[i+1])
                System.out.println("Crescator momentan");
            else {
                System.out.println("On it");
                Arrays.sort(sir);
                System.out.printf("Here u go "+
                        Arrays.toString(sir));
            }
        }

            }
}
