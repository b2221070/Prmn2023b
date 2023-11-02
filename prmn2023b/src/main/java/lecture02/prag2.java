package lecture02;

import java.util.Scanner;

public class prag2 {
    public static void main(String[] args) {

        int[] num = new int[5];

        Scanner scan  = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.print("数字"+(i+1)+"つ目");
            num[i]=scan.nextInt();
        }

        Keisan k = new Keisan();
        int x = k.sum(num);
        k.hantei(x);
    }
}
