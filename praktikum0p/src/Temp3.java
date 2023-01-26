import java.util.Scanner;

public class Temp3 {
    public static void main(String[] args) {
        int n,x,digit=0;
        double exe,temp,swap;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();

        for (int i=0;i<n;i++){
            swap = 0;
            x = scn.nextInt();

            for (int j=0;j<7;j++){
                exe = x/Math.pow(10,j);
                if ((int)exe==0){
                    digit=j;
                    break;
                }
            }

            for (int j=0;j<=digit;j++){
                exe = x/Math.pow(10,j)%10;
                temp = (int)exe*Math.pow(10,digit-j-1);
                swap += temp;
            }

            System.out.println((int)swap);
        }
    }
}
