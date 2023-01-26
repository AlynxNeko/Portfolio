import java.util.Scanner;

public class Temp {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x,y,z;
        int n = scn.nextInt();
        scn.nextLine();

        for (int i=0;i<n;i++){
            x = scn.nextInt();
            y = scn.nextInt();
            z = scn.nextInt();
            System.out.println((y-x)/z);
        }
    }
}