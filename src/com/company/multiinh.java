package com.company;

class Square {
    public void display() { System.out.println("Shape=> Square");
    }
}

class Parameter extends Square { public void area() {
    System.out.println("Parameter=> 14cm");
}
}

class Area extends Parameter { public void volume() {
    System.out.println("Area=> 14cm^2");
}
}

public class multiinh {
    public static void main(String[] arguments) { Area area = new Area();
        area.display(); area.area(); area.volume();
    }
}
