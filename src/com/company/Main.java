package com.company;

import java.util.*;

class Overload { int value; String name;

    Overload() {
        value = 1;
        name = " default constructor";
    }

    Overload(int i) { value = i;
        name = " one parameter constructor";
    }

    Overload(int i, String n) { value = i;
        name = n;
    }

    void display() { System.out.println(value + name);
    }
}

public class Main {

    // constructor overloading
    public static void main(String args[]) {

        Overload obj = new Overload(); obj.display();
        Overload obj1 = new Overload(3); obj1.display();
        Overload obj2 = new Overload(7, " two parameter constructor"); obj2.display();
    }
}
