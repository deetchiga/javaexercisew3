package com.company;

public class prime {
    public static void main(String[] args)
        {
            int i, n, c;
            System.out.println(" Prime Numbers from 1 to 100 are : ");
            for(n=1;n<=100;n++)
            {

                c=0;
                for (i=2;i<=n/2;i++)
                {
                    if(n%i==0)
                    {
                        c++;
                        break;
                    }
                }
                if(c==0 && n!=1 )
                {
                    System.out.print(n + " ");
                }
            }
        }
}
