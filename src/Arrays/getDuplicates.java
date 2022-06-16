package Arrays;

import java.util.Scanner;

public class getDuplicates {
    public static int getDup(String[] r) {

        int totalDup = 0;

        for (int i = 0; i < r.length; i++) {
            int count = 0;

            for (int j = 0; j < r.length; j++) {
                if (r[i].equals(r[j])) {
                    count++;
                }
                if (count != 1) {
                    totalDup++;
                }
            }

        }
        return totalDup;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }
}
