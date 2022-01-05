package com.company;

import java.util.*;

class OutClass { static int x = 10; int y = 20;
    private static int z = 30;

    static class InnClass { void get() {
        System.out.println("x=> " + x); System.out.println("z=> " + z);
    }
    }
}

class nestedClass {
    public static void main(String[] args) {
        OutClass.InnClass ob1 = new OutClass.InnClass();
        ob1.get();
    }
}
