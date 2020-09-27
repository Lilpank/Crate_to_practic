package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_3;

public class Task3_3 {
    public static void main(String[] args) {
        String str = "hello world";
        String str1 = new String(str);
        String str2 = "hello world";
        if(str==str2){
            System.out.println("str==str2");
        }
        if (str == str1) {
            System.out.println("str==str1");
        }
        if (str.equals(str1)) {
            System.out.println("str.equals(str1)");
        }
    }
}
