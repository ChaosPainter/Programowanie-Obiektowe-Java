package Zadania;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
public class Zadania_L2_1
{

    //Scanner in = new Scanner(System.in);
    //Vector<Double> v = new Vector<Double>(10);
    //Random rand = new Random();
    public static void z1_1()
    {
        Random rand = new Random();
        Vector<Double> v = new Vector<Double>();
        double suma=0;
        for (int i = 0; i < 10; i++)
        {
            v.add(rand.nextDouble());
            suma+=v.get(0);
        }
        System.out.println("średnia "+(suma/10));
    }
    public static void z2_1()
    {
        int[] tabp={0,1,2,3,4,5,6,7,8,9};
        int[] tabn={0,1,2,3,4,5,6,7,8};
        for (int i = 0; i <10 ; i+=2)
        {
            System.out.println("tabp "+tabp[i]);
            System.out.println("tabn "+tabn[i]);
        }
    }
    public static void z3_1()
    {
        String[] st={"ala","ma","czarnego","kota","a","adam","ma","psa"};
        for (String s: st )
        {
            System.out.println(s.toUpperCase());
        }
    }
    public static void z4_1()
    {
        String[] st=new String [5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            st[i]=in.next();
        }
        for (int i = 4; i >=0; i--)
        {
            String word="";
            for (int j = st[i].length()-1; j >=0 ; j--)
            {
                char ch=st[i].charAt(j);
                word=word+ch;
            }
            System.out.println(word);
        }
    }

    public static void z5_1()
    {
        Scanner in = new Scanner(System.in);
        int [] tab= new int[8];

        for (int i = 0; i < 8; i++)
        {
            tab[i]=in.nextInt();
        }
        Arrays.sort(tab);
        for (int i = 0; i < 8; i++)
        {
            System.out.println(tab[i]);
        }
    }
    public static void z6_1()
    {
        int [] tab = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            tab[i]=in.nextInt();

        }
        for (int i:tab)
        {
            int silnia=1;
            for (int j=1;j<=i;j++)
            {
                silnia*=j;
            }
            System.out.println(silnia);
        }
    }
    public static void z7_1()
    {
        String [] tab1={"Ala","ma","kota"};
        String [] tab2={"Ala","ma","kota"};
        String [] tab3={"Ala","ma","kot"};
        boolean fl=true;
        for (int i = 0; i < 3; i++)
        {
            if (!tab1[i].equals(tab2[i]))
            {
                fl=false;
                break;
            }

        }
        if (fl)
        {
            System.out.println("tablice 1 i 2 są takie same");
        }
        else
        {
            System.out.println("tablice 1 i 2 są różne");
        }

        fl=true;
        for (int i = 0; i < 3; i++)
        {
            if (!tab1[i].equals(tab3[i]))
            {
                fl=false;
                break;
            }

        }
        if (fl)
        {
            System.out.println("tablice 1 i 3 są takie same");
        }
        else
        {
            System.out.println("tablice 1 i 3 są różne");
        }

    }

}