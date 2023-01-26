import java.util.Scanner;

public class nyy2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int temp = num,digit=0,rev=0,count=0;

        while (temp>0){
            temp/=10;
            digit++;
        }

        temp = num;

        for (int i=1;i<=digit;i++){
            rev += ((temp)%10)*Math.pow(10,digit-i);
            temp/=10;
        }

        for (int i=1;i<num;i++){
            if (num%i==0)
                count++;
        }

        if (count==1)
            System.out.print("prime");
        else System.out.print("not prime");

        if (rev==num)
            System.out.println(", palindrome");
        else System.out.println(", not palindrome");
    }
}
