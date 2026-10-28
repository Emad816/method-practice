package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String fullName;
        fullName = formatName("Emad", "Alhanoun");
        System.out.println(fullName);
    }

    public static String formatName(String first, String last){
        String fullName = String.format("%s %s",last, first);
        return fullName;
    }
}
