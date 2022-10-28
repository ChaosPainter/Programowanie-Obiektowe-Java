package Zadania;

import java.util.Scanner;

public class Zadania_L1_2
{
    public static void z1_2(double a,double b,double c)
    {
        String st= a+""+"*X^2+"+b+""+"*X+"+c+"";

        System.out.println(st);
        double delta=b*b-4*a*c;
        if (delta==0)
        {
            System.out.println(-b/(2*a));
        }
        else
        {
            if (delta>0)
            {
                System.out.println((-b+Math.sqrt(delta))/(2*a));
            }
            else
            {
                if (delta < 0)
                {
                    System.out.println("brak rozwiązań");
                }
            }
        }
    }

    public static void z2_2()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("a lub b lub c");
        String st = in.next();
        System.out.println("podaj X");
        double X= in.nextDouble();
        if (st=="a"||st=="b"||st=="c")
        {
            if (st=="a")
            {
                if (X>0)
                {
                    System.out.println(2*X);
                }
                else
                {
                    if (X==0)
                    {
                        System.out.println(0);
                    }
                    else
                    {
                       if (X<0)
                       {
                           System.out.println(-3*X);
                       }
                    }
                }

            }
            if (st=="b")
            {
                if (X>=1)
                {
                    System.out.println(X*X);
                }
                else
                {
                    if (X<1)
                    {
                        System.out.println(X);
                    }
                }

            }
            if (st=="c")
            {
                if (X>2)
                {
                    System.out.println(2+X);
                }
                else
                {
                    if (X==2)
                    {
                        System.out.println(8);
                    }
                    else
                    {
                        if (X<2)
                        {
                            System.out.println(X-4);
                        }
                    }
                }

            }
        }
    }
    public static void z3_2(int x,int y,int z)
    {

    }
}
