//Generate a random string using stringBuffer

import java.util.Random;
import java.util.Scanner;
public class RandomString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of string : ");
        int len=sc.nextInt();
        String string="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random ran=new Random();
        StringBuffer sb=new StringBuffer();

        for(int i=0;i<len;i++) {
            int randomIndex = ran.nextInt(string.length());
            sb.append(string.charAt(randomIndex));
        }
        System.out.println(sb.toString());


    }
}
