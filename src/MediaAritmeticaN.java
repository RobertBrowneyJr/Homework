public class MediaAritmeticaN {
    public static void main(String[] args) {
        int[] array = new int[] {24,48,56,61,32};
float sum= (float) 0;
float MA;
        for(int i = 0; i < array.length; ++i){
            sum=sum +array[i];
        }
        MA=sum/array.length;
        System.out.println(sum);
        System.out.println(MA);
    }
}
