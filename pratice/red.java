package pratice;

import java.util.Scanner;
import java.util.Random;

public class red {
    public static void main(String[] args){
        int[] a={999,888,10,789,654};
        System.out.println(a.length);
        System.out.println(a[a.length-1]);
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        System.out.println("请输入红包大小");
        double money=s.nextDouble();
        System.out.println("请输入人数");
        int num=s.nextInt();
        int i;
        for(i=0;i<num;i++) {
            if(i<num-1){
                int k=3;
                System.out.println(k);
                money=money-k;
            }
            else if(i==num-1){
                System.out.println(money);
                money=0;
            }
        }


        for(i=0;i<num;i++){
            int k=r.nextInt(a.length-1);
            System.out.println(a[k]);
        }
    }
}
