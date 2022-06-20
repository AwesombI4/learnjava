package Lesson2;

public class WhileLoopExample {
    public static void main(String[] args) {
        // for loop
        // while loop
        // do while loop

        //1. while loop

        //System.out.println(1);
        //System.out.println(2);
        //System.out.println(3);
        //System.out.println(4);
        //System.out.println(5);

        /*int a = 1;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;*/

        int a = 10;
        while (a <= 9)  {
            System.out.println(a);
            a++;
        }
        //2. do-while loop

        do {
            System.out.println(a);
            a++;
        } while (a <= 11);

    }
}
