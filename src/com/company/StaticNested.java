package com.company;

import java.util.*;

class OuterClass
{
    static int x = 15; int y = 25;
    private static int z = 35; static class StaticInnerClass
{
    void get ()
    {
        System.out.println ("x=> " + x);
//	System.out.println("y=> " + y); System.out.println ("z=> " + z);
    }
}
}
class StaticNested
{
    public static void main (String[]args)
    {
        OuterClass.StaticInnerClass ob1 = new OuterClass.StaticInnerClass (); ob1.get ();
    }
}
