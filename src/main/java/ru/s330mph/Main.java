package ru.s330mph;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = -5;

        int summ = x + y;
        System.out.println(summ);

        int diff = x - y;
        System.out.println(diff);

        int multiply = y*z;
        System.out.println(multiply);

        int div = y/z;
        System.out.println(div);

        double q = (7.7+x)*5/2;
        System.out.println(q);

        if (x < y && y > z) {
            System.out.println("правда");
        }else if (x < y || z > y){
            System.out.println("правда");
        }else {
            System.out.println("ложь");
        }

        int result = (int) Math.pow(2, 33);
        int overstack = result +1;
        System.out.println(overstack);
    }
}