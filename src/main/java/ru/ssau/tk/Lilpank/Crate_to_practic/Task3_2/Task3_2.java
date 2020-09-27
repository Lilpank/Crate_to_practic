package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_2;

public class Task3_2 {
    public void getStr(String str){
        byte[] bytes = str.getBytes();
        for (byte byt:bytes) {
            System.out.println(byt);
        }
    }
}
