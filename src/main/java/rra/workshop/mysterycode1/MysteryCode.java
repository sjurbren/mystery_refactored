package rra.workshop.mysterycode1;

public class MysteryCode {
    public static String mysteryCode(String s) {
        String result = "";
        char[] a = s.toCharArray();
        for (short i = 0; i < s.length(); i++) {
            if (a[i] == 32 || a[i] == 95 || a[i] == 45) {
                if (i < s.length() - 1) {
                    // a[i - 1] = a[i + 1] - 42;
                    // a[i + 1] = a[i - 1] + 42;
                    if (a[i + 1] >= 97 && a[i + 1] <= 122) {
                        result += (char) (a[i + 1] - 32);
                    } else
                        result += a[i + 1];
                    i++;
                }
            } else {
                result += a[i];
            }
        }
        return result;
    }
}