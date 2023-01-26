import java.util.Scanner;

public class nyy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int reverse=0,temp = num,digit=0;

        while (temp>0){
            temp/=10;
            digit++;
        }

        temp = num;

        for (int i=1;i<=digit;i++){
            reverse += ((temp)%10)*Math.pow(10,digit-i);
            temp/=10;
        }

        System.out.println(reverse);
        if (num%3==0 && num%5==0)
            System.out.println(Math.abs(reverse-num));
    }
}
