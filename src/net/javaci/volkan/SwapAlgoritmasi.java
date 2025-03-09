package net.javaci.volkan;

public class SwapAlgoritmasi {
    public static void main(String[] args) {
        int a = 5; // a <-- 5
        int b = 9;

        System.out.println("before swap a = " + a);
        System.out.println("before swap b = " + b);

        int temp;
        temp = a; // temp <-- a
        a = b;    // a <- b
        b = temp; // b <-- tep

        System.out.println("after swap a = " + a);
        System.out.println("after swap b = " + b);

    }
}
