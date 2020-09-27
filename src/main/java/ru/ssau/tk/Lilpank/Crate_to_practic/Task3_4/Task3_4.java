package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_4;

public class Task3_4 {
    static boolean palindromeCheck(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
