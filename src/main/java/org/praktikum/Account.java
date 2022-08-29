package org.praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() >=3 && name.length() <= 19) {
            int countSpaces = 0;
            for (char el : name.toCharArray()){
                if (el == ' ') countSpaces++;
            }
            if (countSpaces == 1) {
                int spaceIndex = name.indexOf(' ');
                return spaceIndex != 0 && spaceIndex != (name.length() - 1);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
