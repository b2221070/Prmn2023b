package lecture02;

public class test {
    public static void main(String[] args) {
        String [][]name = new String[2][2];

        for(int i=0; i<2 ; i++){
            for(int j=0;j<2;j++){
                name[i][j]=i+","+j;
                //System.out.println(name[i][j]);
            }
        }

        String str = "1,0";
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(str.equals(name[i][j])){
                    System.out.println("itti");
                }
                else{
                    System.out.println("huitti");
                }
            }
        }

    }
}
