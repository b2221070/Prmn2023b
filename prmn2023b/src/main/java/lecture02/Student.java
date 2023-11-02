package lecture02;
import java.util.Scanner;

public class Student {
    String[][] student = new String[5][2];
    Student(){
        this.student[0][0] = "b1800000";
        this.student[0][1] = "abcd0123";

        this.student[1][0] = "b1900000";
        this.student[1][0] = "qwertyui";

        this.student[2][0] = "b2000000";
        this.student[2][1] = "asdfghjk";

        this.student[3][0] = "b2100000";
        this.student[3][1] = "zxcvbnm,";

        this.student[4][0] = "b2220000";
        this.student[4][1] = "qazwsxed";

    }

    void checkPassword(){
        Scanner scan = new Scanner(System.in);

        System.out.println("学籍番号を入力してください");
        String gakuseki = scan.next();

        for(int i=0;i<5;i++) {
            //入力した学籍番号と一致するデータがあったら
            if (gakuseki.equals(this.student[i][0])) {
                System.out.println("パスワードを入力してください");
                String password = scan.next();

                if (password.equals(student[i][1])) {
                    System.out.println("ログイン完了");
                    return;
                } else {
                    System.out.println("不正なアクセス");
                    System.exit(2);
                }
            }
        }
        System.out.println("error!!");
        System.exit(1);
    }

}
