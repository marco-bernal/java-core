package com.mab.core.strings;

import java.util.List;

public class JoiningStrings {

    public String joinByPipe(List<String> names) {
        return String.join(" | ", names);
    }
}
