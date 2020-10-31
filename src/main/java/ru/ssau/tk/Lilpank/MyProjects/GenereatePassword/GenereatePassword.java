package ru.ssau.tk.Lilpank.MyProjects.GenereatePassword;

import java.util.Random;

public class GenereatePassword {
    private static final String charset = "0123456789abcdefghijklmnopqrstuvwxyz";
    public static String getRandomPassword(int length) {
        Random rand = new Random(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int pos = rand.nextInt(charset.length());
            sb.append(charset.charAt(pos));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getRandomPassword(5));
        System.out.println(getRandomPassword(10));
        System.out.println(getRandomPassword(20));
    }
}
