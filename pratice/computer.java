package pratice;

import java.util.Scanner;

public class computer {
    public static void main(String[] args){
        int ans=0;
        Scanner a=new Scanner(System.in);
        System.out.println("请输入数字:");
        int num1=a.nextInt();
        System.out.println("+，-，*，/");
        String i=a.next();
        System.out.println("请输入数字:");
        int num2=a.nextInt();
        switch(i){
            case "+":
                ans=num1+num2;
                break;
            case "-":
                ans=num1-num2;
                break;
            case "*":
                ans=num1*num2;
                break;
            case "/":
                ans=num1/num2;
                break;
        }
        System.out.println(num1+i+num2+"="+ans);
    }
}
