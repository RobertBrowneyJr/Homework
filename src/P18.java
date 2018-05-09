public class P18 {
    public static void main(String args[]) {
        int x=4;
        int n=5;
        int sum=0;
        int rezultat=1;
        for(int i=1;i<=n;i++){
            rezultat=rezultat*x;
            sum=sum+rezultat;
        }System.out.println(sum+1);
    }
}
