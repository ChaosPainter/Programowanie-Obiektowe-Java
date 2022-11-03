package Zadania;

import java.io.*;


import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Zadania_L1_3
{
    public static void z1_3()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("podaj liczbę studentów");
        int n=in.nextInt();
        int c=0;
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
            //System.out.println(wynik);
            c++;
        }
        if (n!=0)
        {
            wynik=wynik/n;
            System.out.println("Średnia "+wynik);
        }
    }

    public static void z2_3()
    {
        Scanner in = new Scanner(System.in);
        Vector<Double> v = new Vector<Double>(10);
        int dodatnie=0;
        int ujemne=0;
        double suma_dodatnie=0;
        double suma_ujemne=0;
        for (int i = 0; i<10; i++)
        {
            v.add(in.nextDouble());
        }
        for (int i = 0; i < 10; i++)
        {
            if (v.get(i)>=0)
            {
                dodatnie++;
                suma_dodatnie=suma_dodatnie+v.get(i);
            }
            else
            {
                ujemne++;
                suma_ujemne=suma_ujemne+v.get(i);
            }
        }
        System.out.println("dodatnich "+dodatnie);
        System.out.println("ujemnych "+ujemne);
        System.out.println("suma dodatnich "+suma_dodatnie);
        System.out.println("suma ujemnych "+suma_ujemne);
    }

    public static void z3_3()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("podaj długość ciągu");
        int n =in.nextInt();
        int suma_parzystych =0;
        Vector<Integer> v = new Vector<Integer>(n);
        System.out.println("podaj "+n+" liczb");
        for (int i = 0; i < n; i++)
        {
            v.add(in.nextInt());
        }
        for (int i = 0; i < n; i++)
        {
            if (v.get(i)%2==0)
            {
                suma_parzystych+=v.get(i);
            }
        }
        System.out.println("suma pparzystych "+suma_parzystych);
    }

    public static void z4_3()
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("podaj długość ciągu");
        int n =in.nextInt();
        int suma_parzystych =0;
        Vector<Integer> v = new Vector<Integer>(n);
        for (int i = 0; i < n; i++)
        {
            int a =rand.nextInt(55)-10;
            System.out.println(a);
            v.add(a);
        }
        for (int i = 0; i < n; i++)
        {
            if (v.get(i)%2==0)
            {
                suma_parzystych+=v.get(i);
            }
        }
        System.out.println("suma pparzystych "+suma_parzystych);
    }

    public static void z5_3()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("podaj słowo");
        String word = in.next();
        String rev="";
        char ch;
        for (int i = word.length()-1; i >=0 ; i--)
        {
            ch=word.charAt(i);
            rev=rev+ch;
        }
        if (rev.equals(word))
        {
            System.out.println("jest palindromem");
        }
        else
        {
            System.out.println("nie jest palindromem");
        }
    }

}
