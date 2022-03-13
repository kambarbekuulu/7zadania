package com.company;

public class Main {

    public static void main(String[] args) {
        method1(new int[]{98, 2, 3, 4, 5, 67});
    method2(new  int[]{12,3,5,46,7,42});
    }
    static void method1(int[] a){
        int max=0;
        for (int i = 0; i < a.length; i++) {

            if(max<a[i]){//98<67
                max=a[i];//max=1;
            }
        }
           System.out.println(max);

        ;
    }
    static void method2 (int[] a){
          int min = 7;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]){
                min = a[i];
            }
        }
        System.out.println(min);


    }

}
