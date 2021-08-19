package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        testPermuation();
    }

    private static void testPermuation() {
        PermutationWithRange permutationWithRange = new PermutationWithRange();
        System.out.println(permutationWithRange.permuation(new char[]{'a','a', 'b', 'c'}, 2, 3));
    }
}
