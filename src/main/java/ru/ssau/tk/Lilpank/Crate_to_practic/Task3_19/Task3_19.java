package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_19;

import java.util.Arrays;
import java.util.function.Function;

public class Task3_19 {
    static String[] parseStringOnArray(String str) {
        String[] arrayStr = str.split(" ");
        return Arrays.stream(arrayStr)
                .filter(s -> !s.isEmpty())
                .map(s -> s.replace(
                        String.valueOf(s.charAt(0)),
                        String.valueOf(s.charAt(0)).toUpperCase()
                ))
                .toArray(String[]::new);

//        for (int i = 0; i < arrayStr.length; i++) {
//            if (!arrayStr[i].isEmpty()) {
//                arrayStr[i] = arrayStr[i].substring(0, 1).toUpperCase() + arrayStr[i].substring(1);
//            }
//        }
//        return arrayStr;
    }
}
