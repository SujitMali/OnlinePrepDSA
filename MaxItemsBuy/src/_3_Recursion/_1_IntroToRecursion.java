package _3_Recursion;

public class _1_IntroToRecursion {
    public static void main(String[] args) {
        message1();
    }

    static void message1(){
        System.out.println("Hello 1");
        message2();
    }
    static void message2(){
        System.out.println("Hello 2");
        message3();
    }
    static void message3(){
        System.out.println("Hello 3");
        message4();
    }
    static void message4(){
        System.out.println("Hello 4");
        message5();
    }
    static void message5(){
        System.out.println("Hello 5");
    }

}
