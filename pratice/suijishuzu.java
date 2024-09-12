package pratice;

import Studentwork.student;
import java.util.Random;

public class suijishuzu {
    public static void main(String[] args){
        int[] m={1,3,5,7,9};
        int i,j;
        int b=(int)(Math.random()*7);
        Random r=new Random();
        for(i=0;i<m.length;i++){
            int z=r.nextInt(5);
            j=m[i];
            m[i]=m[z];
            m[z]=j;

        }
        i=0;
        while(i<m.length){
            System.out.println(m[i]);
            i++;
        }
        Studentwork.student s=new student();
       niu('s');
    }
    public static void niu(char n){
        System.out.println(n);
    }
}
