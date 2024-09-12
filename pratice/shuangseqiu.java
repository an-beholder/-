package pratice;

import Studentwork.student;
import java.util.Random;
import java.util.Scanner;

public class shuangseqiu {
    public static void main(String[] args) {
        //双色球 红1-33，蓝1-16
        //用户6红1蓝
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int[] red = new int[7];
        int[] ans = new int[7];
        String a=s.next();
        int i, j, flag = 1;
        for (i = 0; i < red.length - 1; i++) {
            System.out.print("请输入第" + (i + 1) + "个红球号码:" + "(1-33)");
            red[i] = s.nextInt();
        }
        System.out.print("请输入第" + 1 + "个蓝球号码:(1-16)");
        red[i] = s.nextInt();
        for (i = 0; i < red.length - 1 && flag == 1; i++) {
            flag = 0;
            for (j = 0; j < red.length - 2; j++) {
                if (red[j] > red[j + 1]) {
                    flag = red[j];
                    red[j] = red[j + 1];
                    red[j + 1] = flag;
                    flag = 1;
                }
            }
        }
        for(i=0;i<red.length-1;i++){
            ans[i]=r.nextInt(33)+1;
        }
        ans[i]=r.nextInt(16)+1;

        for (i = 0; i < ans.length - 1 && flag == 1; i++) {
            flag = 0;
            for (j = 0; j < ans.length - 2; j++) {
                if (ans[j] > ans[j + 1]) {
                    flag = ans[j];
                    ans[j] = ans[j + 1];
                    ans[j + 1] = flag;
                    flag = 1;
                }
            }

        }
        haoma(red);
        System.out.println(" ");
        haoma(ans);

    }

    void paixu(int[] red) {
        int i, j, flag = 0;
        for (i = 0; i < red.length - 1 && flag == 1; i++) {
            flag = 0;
            for (j = 0; j < red.length - 2; j++) {
                if (red[j] > red[j + 1]) {
                    flag = red[j];
                    red[j] = red[j + 1];
                    red[j + 1] = flag;
                    flag = 1;
                }
            }

        }
    }
    public static void haoma(int[] red){
        int i;
        System.out.print("红球：");
        for(i=0;i<red.length-1;i++){
        System.out.print(red[i]+" ");
        }
        System.out.print("蓝球：");
        System.out.print(red[i]);
    }
}
