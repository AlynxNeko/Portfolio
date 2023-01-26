package com.dp.teori;

public class LatMethod5 {
    public static void main(String[] args) {
        String text = "Wawewowe wowawawa jaja jasuke jagung susu keju jago keren kece dhuar";
        System.out.println(hurufHidup(text));
    }

    public static int hurufHidup(String text) {
        int count =0;
        for (int i=0;i<text.length();i++)
            switch (text.charAt(i)){
                case 'a':
                case 'i':
                case 'u':
                case 'e':
                case 'o': {
                    count++;
                }
            }
        return count;
    }
}
