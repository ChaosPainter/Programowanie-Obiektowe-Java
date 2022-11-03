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
    public static void z3_2()
    {
        Scanner in  = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if (x>y && x >z)
        {
            System.out.println(x);
            if (y>z)
            {
                System.out.println(y);
                System.out.println(z);
            }
            else
            {
                System.out.println(z);
                System.out.println(y);
            }
        }
        if (y>x&&y>z)
        {
            System.out.println(y);
            if (x>z)
            {
                System.out.println(x);
                System.out.println(z);
            }
            else
            {
                System.out.println(z);
                System.out.println(x);
            }
        }
        if (z>x&&z>y)
        {
            System.out.println(z);
            if (x>y)
            {
                System.out.println(x);
                System.out.println(y);
            }
            else
            {
                System.out.println(y);
                System.out.println(x);
            }
        }
    }

    public static void z4_2()
    {
        Scanner in  = new Scanner(System.in);
        System.out.println("Deszcz?");
        boolean rain = in.nextBoolean();
        System.out.println("Autobus?");
        boolean autobus = in.nextBoolean();

        if (rain && autobus)
        {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnie");
        }
        if (rain && !autobus)
        {
            System.out.println("Nie dostaniesz się na uczelnie");
        }
        if (!rain && autobus)
        {
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }

    public static void z5_2()
    {
        boolean premia;
        boolean discount;
        Scanner in=new Scanner(System.in);
        System.out.println("Zniżka?");
        discount=in.nextBoolean();
        System.out.println("Premia?");
        premia=in.nextBoolean();
        if (!discount||premia)
        {
            System.out.println("Możesz kupić samochód!");
            System.out.println("Zniżki na samochód nie ma");
        }
        if (!discount||!premia)
        {
            System.out.println("Zakup samochód trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        }
        if (discount||premia)
        {
            System.out.println("Możesz kupić samochód !");
        }
    }

    public static void z6_2()
    {
        double a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj a");
        a=in.nextDouble();
        System.out.println("Podaj b");
        b=in.nextDouble();
        System.out.println("Wybierz działanie + - * / ");
        String st=in.next();
        switch (st)
        {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if (b!=0)
                {
                    System.out.println(a/b);
                    break;
                }
                System.out.println("dzielenie przez 0");
                break;
            default:
                System.out.println("nierozpoznane działanie");
                break;
        }
    }
}
