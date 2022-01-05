package com.company;

class CustomException extends Exception { public CustomException(String s) {
    super(s);
}
}

public class userException {
    static void isLess(int num) throws CustomException { if (num < 0) {
        throw new CustomException("Number is negative");
    }
    else {
        System.out.println("number is positive");
    }
    }

    public static void main(String[] args) { var num = 2;
        try { isLess(num);
        } catch (CustomException e) { System.out.println("caught the error " + e);
        }
    }
}
