//https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;
import java.io.*;
import java.lang.Math; 

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a[] = new int[t];
        int b[] = new int[t];
        int n[] = new int[t];

        
        for(int i=0;i<t;i++){
             a[i] = in.nextInt();
             b[i] = in.nextInt();
             n[i] = in.nextInt(); 
        }
        
        in.close();
        //System.out.println(t);
        /*for(int i=0;i<t;i++){
            System.out.print(a[i]+" ");
            System.out.print(b[i]+" ");
            System.out.print(n[i]+"\n");
            
            //System.out.println();
        }*/
        //int z = n.length;
        for(int j=0;j<t;j++){//There are two values of a,b,n
            double sum = a[j];//This value should be added only one time
           
        for (int i=0;i<n[j];i++)//The value of n[0] = 10 and n[1] =5
            // The loop will respectively run 10 and 5 times 
        {
            //for(int j=0;j<t;j++)
                
                
                sum = sum + ((Math.pow(2, i)*b[j]));
                
                System.out.print((int)sum+" ");
                
        }
            System.out.println();
        }
    }
}
