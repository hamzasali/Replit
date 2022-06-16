package scanner;

import java.util.Scanner;

public class LameDb {
    public static String lameDb(String db, String op, String id, String data) {

        String[] split = db.split("#");


        String result = "";
        switch (op) {
            case "add":
                for (int i = 0; i < split.length; i++) {
                    if (!("" + split[i].charAt(0)).equals(id)) {
                        result += split[i] + "#";
                    } else {
                        result += id + data + "#";

                        while (i < split.length) {
                            if (i != split.length - 1) {
                                result += (i + 2) + split[i].substring(1) + "#";
                            } else {
                                result += (i + 2) + split[i].substring(1);
                            }

                            i++;
                        }
                        return result;
                    }
                }
                result += id + data;
                break;
            case "edit":
                if (db.indexOf("#", db.indexOf(id)) == -1) {
                    result = db.replace(db.substring(db.indexOf(id)), id + data);
                } else {
                    result = db.replace(db.substring(db.indexOf(id), db.indexOf("#", db.indexOf(id))), id + data);
                }
                break;
            case "delete":
                if (db.indexOf("#", db.indexOf(id)) == -1) {
                    result = db.replace(db.substring(db.indexOf(id) - 1), "");
                } else {
                    result = db.replace(db.substring(db.indexOf(id), db.indexOf("#", db.indexOf(id)) + 1), "");
                }
                break;
        }


        return result;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
        System.out.println(lameDb("1etsy#2wooden#3spoon#4glass", "add", "4", "aaa"));

        System.out.println(lameDb("1etsy#2wooden#3spoon", "add", "1", "bbb"));

        System.out.println(lameDb("1test#2bla#3foo", "edit", "2", "bbb"));

        System.out.println(lameDb("1tst#2bla#3foo", "delete", "1", ""));
        System.out.println(lameDb("1other#2example#3text", "edit", "3", "book"));
        System.out.println(lameDb("1other#2example#3text", "delete", "3", ""));
        String db = "1other#2example#3text";

        System.out.println(db.replace(db.substring(db.indexOf("3") - 1), ""));


    }
}
