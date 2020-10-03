package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_21;

public class Task3_21 {
    public static void main(String[] args) {
        String str = "hello world";
        /*str.length() = 10 должны замениться буквы h l o w r d на цифры 0 2  4 6 8 10
            получиться - 0e2l4 6o8l10, но после метода reverse() будет: 01l8o6 4l2e0
        */
        StringBuilder strBldr = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                strBldr.replace(i, i + 1, i + "");
            }
        }

        strBldr.reverse();
        System.out.println(strBldr.toString());
    }
}
