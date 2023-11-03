package lecture03;
import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.s;

public class pra2_1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("名前を入力してください");
        String name1 = scan.next();

        System.out.println("学籍番号を入力してください");
        int num = scan.nextInt();
        System.out.println("氏名："+name1+", 学籍番号：b"+num);
    }
}
