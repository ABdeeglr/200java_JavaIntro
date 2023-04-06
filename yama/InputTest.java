/**
 * Nonething to say
 */

import java.util.*;

public class InputTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // get first input
        System.out.print("What is your name? >>");
        String name = in.nextLine();

        // get second input
        System.out.print("How old are you? >>");
        var age = in.nextInt();

        // display output on console
        System.out.printf("Hello, %s. Next year, you'll be %d years old.", name, age + 1);
    }
}
