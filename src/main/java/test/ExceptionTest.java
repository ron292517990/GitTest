package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExceptionTest {
    private int size;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String s = null;
//        s = "";
        getMap();
        return;
    }

    private static void getMap() {
        Map<String, String> map = new HashMap<String, String>();
        HashMap<String, String> stringStringHashMap = new HashMap<String, String>();

        map.put("1", "2");
        map.put("1", "2");
        map.put("1", "2");

        String s1 = "1";
        String s2 = "1";
        String s3 = "1";
        String s4 = "1";


        throw new RuntimeException("");
    }

    /**
     * test1
     */
    public void test1() {
        new String();
        test2();
    }

    /**
     * test2
     */
    public void test2() {
        test3();
        test2();
    }

    public void test3() {
        ExceptionTest exceptionTest = new ExceptionTest();
        exceptionTest.test1();
    }

}
