package com.bilibiliSchool.Day03.Day002;

import java.util.Arrays;

public class DemoArrays {

    public static void main(String[] args) {

        int[] intArr = {1, 3, 7, 4, 5, 2, 6};
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        String str = "kdfkshrejdjfvnjshie";
        char[] chAr = str.toCharArray();
        Arrays.sort(chAr);
        System.out.println(Arrays.toString(chAr));
        for (int i = chAr.length - 1; i >= 0; i--) {
            System.out.print(chAr[i]);
        }
    }
}
