package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_5;

import java.util.Objects;

public class Task3_5 {
    static boolean differentStr(String _1str,String _2str){
        return !Objects.equals(null, _1str) && !Objects.equals(null, _2str)
                && !_1str.equals(_2str)
                && _1str.equalsIgnoreCase(_2str);
    }
}
