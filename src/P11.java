import java.util.Scanner;

public class P11 {
    public static void main(String args[]) {
        int a [] = {1,3,4,6,7,8,10,12,14,23};
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Numarul Va rog");
        int pozitie = 0;
        for (int i=1; i<a.length;i++){
            if (number == a[i]){
                pozitie = i+1;
            System.out.println("Numarul"+ number + "se afla pe pozitia " + pozitie);}
            else
                System.out.println("-1");
        }

    }

}
