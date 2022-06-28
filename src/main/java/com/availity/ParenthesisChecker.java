package com.availity;

import java.util.Stack;

public class ParenthesisChecker {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Expecting only 1 argument");
            System.exit(1);
        }

        if (args[0] == null || args[0].equals("")) {
            System.out.println("A non-empty string value should be provided");
            System.exit(2);
        }

        System.out.println(isValid(args[0]));
    }

    public static boolean isValid(String str) {
        if (!str.contains("(") && !str.contains(")")) return false;

        Stack<Character> stack = new Stack<>();

        for (var c: str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                if (stack.size() > 0) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }

        return stack.size() == 0;

    }
}
