package pratice;

public class kath {
    public static void main(String[] args){
        int i,num;
        for (num=100;num<=200;num++){
            for(i=2;i<num;i++){
                if(num%i!=0){
                 continue;
                }
                else if(num%i==0){
                    break;
                }
            }
            if(i==num)
                System.out.print(num+" ");
        }
        System.out.println();
        for(num=1;num<=9;num++){
            for(i=1;i<=num;i++){
                System.out.print(i+"×"+num+"="+(i*num)+" ");
            }
            System.out.println();
        }
        int n;
        for(num=0;num<5;num++){
            for(i=0;i<9-num;i++){
                System.out.print(" ");
            }
            n=num*2+1;
            while(n>0) {
                System.out.print("*");
                n--;
            }
            System.out.println();
        }
    }
}
