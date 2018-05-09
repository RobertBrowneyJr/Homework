public class MediaAritmetica0 {
    public static void main(String[] args) {
    int[] array = new int[] {24,48,56,61,0,32};
    float sum= (float) 0;
    float MA;

           for(int i = 0; i < array.length; ++i){
               if (array[i]!=0) sum=sum+array[i];
               else break;
           }

        MA=sum/array.length;
    System.out.println(sum);
        System.out.println(MA);

}
}
