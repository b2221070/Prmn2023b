package lecture03;

public class Login {
    String name;
    int num;

    Login(String name,int num){
        this.name = name;
        this.num = num;
    }

    void message(String name_n,int num_n){
        if(this.name.equals(name_n)){
            if(this.num==num_n) {
                System.out.println("ログイン成功");
                return;
            }
        }
        System.out.println("ログイン失敗");
    }
}
