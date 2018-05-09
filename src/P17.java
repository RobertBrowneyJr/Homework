public class P17 {
    public static void main(String args[]) {
        int[] sir = {12, 4, 5, 3, 7, 8,11,2};
        for (int i = 0; i < (sir.length-1); i++) {

            if (sir[i] > sir[i + 1])
                System.out.println("Perechea este: " + sir[i] + ", " + sir[i + 1]);


        }
    }
}
