package Zadania;

public class Zadania_L1_1 {
    public static void z1_1()
    {
        System.out.println("Wojciech 30");
    }
    public static void z2_1(int a, int b)
    {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
    }

    public static boolean z3_1(int a)
    {
        if (a%2==0)
        {
            System.out.println("true");
            return true;
        }

        System.out.println("false");
        return false;
    }
    public static boolean z4_1(int a)
    {
        if ((a%3==0) && (a%5==0))
        {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
    public static int z5_1(int a)
    {
        return a*a*a;
    }
    public static double z6_1(int a)
    {
        double wy = Math.sqrt(a);
        return wy;
    }
    public static boolean z7_1(double a, double b, double c)
    {
        if (a>b&&a>c)
        {
            if (a*a==b*b+c*c)
            {
                System.out.println("true");
                return true;
            }
        }
        else
        if (b>a&&b>c)
        {
            if (b*b==a*a+c*c)
            {
                System.out.println("true");
                return true;
            }
        }
        else
        if (c>a&&c>b)
        {
            if (c*c==a*a+b*b)
            {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
}
