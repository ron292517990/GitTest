package service;

import java.util.LinkedList;
import java.util.List;

public class MyClass {
    // some code here
    int a = 0;
    int b = 0;

    public void method() {
        List list = new LinkedList();
    }


    public void method2(float edgeWidth,
                        int x1, int x2, int y1, int y2) {

        Double anotherClass = null;
        int a = 0;
        int b = a + anotherClass.intValue();
    }

    public void method3() {
        int c=add(a,b);
        int d=add(a,c);
    }

    private int add(int a, int b) {
        return a+b;
    }
}
