/****************** Exercise 6 ******************
  * Write a program that includes and calls the
 * storage() method defined as a code fragment in this chapter.
 ************************************************/

public class Storage {

    public static void main(String[] args) {
        String s = "String 16 length";
        int res = storage(s);
        System.out.println(res);
    }

    public static int storage(String s){
        return s.length() * 2;
    }
}
