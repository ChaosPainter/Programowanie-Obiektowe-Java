import java.util.Scanner;
import Zadania.Zadania_L1_1;

public class Main {
    public static void main(String[] args)
    {
        Zadania_L1_1.z1_1();
        Zadania_L1_1.z2_1(5,15);
        Zadania_L1_1.z3_1(6);
        Zadania_L1_1.z3_1(5);
        Zadania_L1_1.z4_1(15);
        Zadania_L1_1.z4_1(12);
        System.out.println(Zadania_L1_1.z5_1(3));
        System.out.println(Zadania_L1_1.z6_1(16));
        Zadania_L1_1.z7_1(3,4,5);
        Zadania_L1_1.z7_1(3,4,6);
        Scanner in=new Scanner(System.in);
        Zadania_L1_1.z7_1(in.nextInt(), in.nextInt(), in.nextInt());


    }



}