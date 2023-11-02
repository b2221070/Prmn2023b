package lecture02;

public class Keisan {

    int sum(int[]num){
        int x=0;
        for(int i=0;i<5;i++){
            x = x+num[i];
        }
        return x;
    }

    void hantei(int x){
        if(x<=49){
            System.out.println("small");
        } else if (x<=100) {
            System.out.println("big");
        }
        else {
            System.out.println("great!!");
        }
    }
}
