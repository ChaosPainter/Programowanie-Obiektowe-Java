import java.util.Scanner;
import Zadania.Zadania_L1_1;

public class Main {
    public static void main(String[] args)
    {
        Zadania_L1_1.z1();
        Zadania_L1_1.z2(5,15);
        Zadania_L1_1.z3(6);
        Zadania_L1_1.z3(5);
        Zadania_L1_1.z4(15);
        Zadania_L1_1.z4(12);
        System.out.println(Zadania_L1_1.z5(3));
        System.out.println(Zadania_L1_1.z6(16));
        Zadania_L1_1.z7(3,4,5);
        Zadania_L1_1.z7(3,4,6);
        Scanner in=new Scanner(System.in);
        Zadania_L1_1.z7(in.nextInt(), in.nextInt(), in.nextInt());


    }



}