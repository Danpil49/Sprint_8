package org.praktikum;

public class Praktikum {

    public static void main(String[] args) {
        String firstNameAndLastName = "Тимоти Шаламе";
        Account account = new Account(firstNameAndLastName);
        System.out.println(account.checkNameToEmboss());

    }

}
