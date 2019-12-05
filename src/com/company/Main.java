package com.company;

public class Main {

    public static void main(String[] args) {/*
        System.out.println("Foobar".endsWith("bar"));
        System.out.println("Foobar".startsWith("Foo"));
        System.out.println("we are going to check substring method".substring(5, 12));
        System.out.println("we are going to check substring method".substring(6));
        System.out.println("we are going to check substring method".indexOf('t'));
        System.out.println("we are going to check substring method".lastIndexOf('t'));
        System.out.println("we are going to check substring method".indexOf('o', 10));
        System.out.println("we are going to check substring method".lastIndexOf('o', 11));*/
        String a = "Anna";
        int a1 = 20;
        System.out.println("Name - " + a + ", age - " + a1);
        System.out.println(String.format("Name - %s, age - %d",a,a1));

        int i = Integer.parseInt("kitty123".replaceAll("[\\D]",""));
        int j = Integer.parseInt("123kitty".replaceAll("[\\D]",""));
        int k = Integer.parseInt("1k2it3ty".replaceAll("[\\D]",""));

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        String s = "0001234-cat";
        s = s.replaceFirst("^0*", "");
        System.out.println(s);


    }
}
