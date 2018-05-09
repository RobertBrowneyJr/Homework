public class Sir {
    public static void main(String args[]) {
        int[] array = {2,6,12,31,1,6};
        int max=0;
        int max2=0;
        int min=array[0];
        for(int i = 0; i < array.length; i++){
            max=array[i];
            System.out.println("Sirul dublat este "+max*2);
            if (max2<max)
                max2=max;


        }
        for(int i = 1; i < array.length; i++){
            max=array[i];
            if (min>max)
                min=max;


        }

        System.out.println(max2) ;
        System.out.println(min) ;
        System.out.println(min+max2);

    }
}
