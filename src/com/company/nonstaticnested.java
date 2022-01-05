package com.company;

import java.util.*;

class Outr
{ static int x = 12; int y = 25;
    private static int z = 33;

    class NonStaticInnerClass { void get() {
        System.out.println("x=> " + x); System.out.println("y=> " + y); System.out.println("z=> " + z);
    }
    }
}

class nonstaticnested {
    public static void main(String[] args) { Outr obj1 = new Outr();
        Outr.NonStaticInnerClass obj2 = obj1.new NonStaticInnerClass(); obj2.get();
    }
}

