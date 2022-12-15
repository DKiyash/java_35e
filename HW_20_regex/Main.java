package java_35e_HW.HW_20_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//      Task №1
//      ---------------------------------------------------------------------------------
        String str1 = "zfbmnaDIcwrnbbrkekbe";
        Pattern p11 = Pattern.compile("[a-z]");
        Pattern p12 = Pattern.compile("[A-Z]");
        Pattern p13 = Pattern.compile("[0-9]");
        System.out.println("Task №1");
        System.out.println("-".repeat(50));
        System.out.println("Pattern: " + "[a-z]");
        System.out.println(str1 + " -> " + p11.matcher(str1).find());
        System.out.println("Pattern: " + "[A-Z]");
        System.out.println(str1 + " -> " + p12.matcher(str1).find());
        System.out.println("Pattern: " + "[0-9]");
        System.out.println(str1 + " -> " + p13.matcher(str1).find());
        System.out.println();

//      Task №2
//      ---------------------------------------------------------------------------------
        String str21 = "aaaapgdgdsq";
        String str22 = "aaaapsfhsfh";
        System.out.println("Task №2");
        System.out.println("-".repeat(50));
        Pattern p2 = Pattern.compile("p.*?q$");
        System.out.println("Pattern: " + "p.*?q$");
        System.out.println(str21 + " -> " + p2.matcher(str21).find());
        System.out.println(str21 + " -> " + p2.matcher(str22).find());
        System.out.println();

//      Task №3
//      ---------------------------------------------------------------------------------
        String str31 = "AgddHbnfFH_GDsgsg1dsgSdg3";
        String str32 = "KGHSDG8jm3!!@#";
        System.out.println("Task №3");
        System.out.println("-".repeat(50));
        Pattern p3 = Pattern.compile("^\\w+$");
        System.out.println("Pattern: " + "^\\w+$");
        System.out.println(str31 + " -> " + p3.matcher(str31).find());
        System.out.println(str32 + " -> " + p3.matcher(str32).find());
        System.out.println();

//      Task №4
//      ---------------------------------------------------------------------------------
        String str41 = "12345678";
        String str42 = "2000";
        System.out.println("Task №4");
        System.out.println("-".repeat(50));
        System.out.println("Pattern: " + "\\d{1,3}");
        System.out.println(str41 + " -> " + separ(str41));
        System.out.println(str42 + " -> " + separ(str42));
        System.out.println();

//      Task №5
//      ---------------------------------------------------------------------------------
        String str51 = "+380678264596";
        String str52 = "+38 067 826-45-96";
        System.out.println("Task №5");
        System.out.println("-".repeat(50));
        Pattern p5 = Pattern.compile("(\\+\\d{1,3}( |-)?)?\\d{3}( |-)?\\d{3}( |-)?\\d{2}( |-)?\\d{2}");
        System.out.println("Pattern: " + "(\\+\\d{1,3}( |-)?)?\\d{3}( |-)?\\d{3}( |-)?\\d{2}( |-)?\\d{2}");
        System.out.println(str51 + " -> " + p5.matcher(str51).find());
        System.out.println(str52 + " -> " + p5.matcher(str52).find());
        System.out.println();

//      Task №6
//      ---------------------------------------------------------------------------------
        String str61 = "(x^2+567*tt/r-768)^24";
        String str62 = "lkngfwegn";
        System.out.println("Task №6");
        System.out.println("-".repeat(50));
        Pattern p6 = Pattern.compile("[\\(\\)]?(\\d+)?(\\w+)?(\\+|-|\\*|\\/|\\^)(\\d+)?(\\w+)?[\\(\\)]?");
        System.out.println("Pattern: " + "[\\(\\)]?(\\d+)?(\\w+)?(\\+|-|\\*|\\/|\\^)(\\d+)?(\\w+)?[\\(\\)]?");
        System.out.println(str61 + " -> " + p6.matcher(str61).find());
        System.out.println(str62 + " -> " + p6.matcher(str62).find());
        System.out.println();

//      Task №7
//      ---------------------------------------------------------------------------------
        String str71 = "AbCd";
        String str72 = "ACd";
        System.out.println("Task №7");
        System.out.println("-".repeat(50));
        System.out.println("Pattern: " + "[A-Z][a-z]");
        System.out.println(str71 + " -> " + insertDash(str71));
        System.out.println(str72 + " -> " + insertDash(str72));
    }

    public static String separ(String str) {
        String myPatern = "\\d{1,3}";
        Pattern p = Pattern.compile(myPatern);
        StringBuffer sb1 = new StringBuffer(str);
        sb1.reverse();
        Matcher m = p.matcher(sb1);
        StringBuffer sb2 = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb2, m.group() + ",");
        }
        sb2.reverse();
        sb2.deleteCharAt(0);
        return sb2.toString();
    }

    public static String insertDash(String str) {
        String myPatern = "[A-Z][a-z]";
        Pattern p = Pattern.compile(myPatern);
        Matcher m = p.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group().charAt(0) + "-" + m.group().charAt(1));
        }
        return sb.toString();
    }
}


/*
1. TODO: Write a Java program to check whether a string contains only a certain set of characters
    (in this case a-z, A-Z and 0-9).
2. TODO: Write a Java program that matches a string that has a 'p' followed by anything, ending in 'q'.
    aaaapgdgdsq -> true
    aaaapsfhsfh -> false
3. TODO: Write a Java program to match a string that contains only upper and lowercase letters,
    numbers, and underscores.
    AgddHbnfFH_GDsgsg1dsgSdg3 -> true
    KGHSDG8jm3!!@# -> false
4. TODO: Write a Java program that takes a number and set thousands separator in that number.
    2000 -> 2,000
5. TODO: Write a Java program to validate a given phone number.
    Телефонные номера начинаются с + и имеют 1-3 символа кода страны, затем идет 3 символа кода оператора и
    7 символов самого номера
6. TODO: Write a Java program to check if a given string is a Mathematical Expression or not.
    Строка может содержать в себе буквы и цифры, разделенные символами +, -, *, /
7. TODO: Write a Java program to insert a dash (-) between an upper case letter and a lower case letter
     in a given string. AbCd -> A-bC-d
*/