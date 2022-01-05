package com.company;

import java.util.*;

class TCF {
    public static void main(String[] args)
    {
        int a = 10, b = 0, result; try {
        result = a / b; System.out.println(result);
    }
    catch (ArithmeticException e) { System.out.println("Exception caught:Division by zero");
    }
    finally {
        System.out.println("I am in final block");
    }
    }
}

