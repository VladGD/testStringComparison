/*
 * Проверяем как работает сравнение строк в Java.
 *
 * Оператор == по сути, сравнивает не две строки, а лишь ссылки, на которые указывают строки.
 *
 */

import java.util.Objects;

public class Main {

    /**
     *
     * */
    public static void main(String[] args) {

        System.out.println("= main");


        /* #1
        *
        * */
        System.out.println("#1");

        String str1_1 = "string1";
        String str1_2 = "string1";

        System.out.printf(" \"%s\" == \"%s\" -> ", str1_1, str1_2);

        if (str1_1 == str1_2){
            System.out.println("true");
        }
        else{ System.out.println("false");}

        /* #2
        * Создаем два объекта String
        * эти строки будут разные
        * */

        String str2_1 = new String("string2");
        String str2_2 = new String("string2");

        System.out.println("#2");
        System.out.printf(" \"%s\" == \"%s\" -> ", str2_1, str2_2);

        if (str2_1 == str2_2){ System.out.println("true"); }
        else{ System.out.println("false");}

        /* #3
        *
        * */
        String str3_1 = "string3";
        String str3_2 = "string3";

        System.out.println("#3");
        System.out.printf(" \"%s\" equals \"%s\" -> ", str3_1, str3_2);
        // System.out.println(Objects.equals( str3_1, str3_2));
        System.out.println(str3_1.equals(str3_2));

        /* #4
         *
         * */
        String str4_1 = new String("string4");
        String str4_2 = new String("string4");

        System.out.println("#4");
        System.out.printf(" \"%s\" equals \"%s\" -> ", str4_1, str4_2);

        System.out.println(str4_1.equals(str4_2));

        /* #5
         *
         * */
        String str5_1 = "string5";
        String str5_2 = new String("string5");

        System.out.println("#5");
        System.out.printf(" \"%s\" equals \"%s\" -> ", str5_1, str5_2);

        System.out.println(str5_1.equals(str5_2));

        /* #6
         *
         * */
        String str6_1 = "string6";
        String str6_2 = "STRING6";

        System.out.println("#6");
        System.out.printf(" \"%s\" == \"%s\" -> ", str6_1, str6_2);

        if (str6_1 == str6_2){ System.out.println("true"); }
        else{ System.out.println("false");}

        /* #7
         *
         * */
        String str7_1 = "string7";
        String str7_2 = new String("STRING7");

        System.out.println("#7");
        System.out.printf(" \"%s\" equals \"%s\" -> ", str7_1, str7_2);

        System.out.println(str7_1.equals(str7_2));




    }
}