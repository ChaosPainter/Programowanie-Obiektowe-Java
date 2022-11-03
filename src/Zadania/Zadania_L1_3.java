package Zadania;

import java.io.*;


import java.util.Scanner;
import java.util.Vector;

public class Zadania_L1_3
{
    public static void z1_3()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("podaj liczbę studentów");
        int n=in.nextInt();
        int c=1;
        double wynik=0;
        Vector<Double> v=new Vector<Double>(n);
        while (c!=n)
        {
            System.out.println("podaj punkty");
            v.add(in.nextDouble());
            c++;
        }
        c=0;
        while (c!=v.size())
        {
            wynik=wynik+v.get(c);
            c++;
        }
        if (n!=0)
        {
            wynik=wynik/n;
        }






    }

}
