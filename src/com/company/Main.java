package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(StackBrackets.isCorrect("{{}}"));
        System.out.println(StackBrackets.isCorrect("{(}}"));
        System.out.println(StackBrackets.isCorrect("({{[]([])}}())[[{}]]"));
        System.out.println(StackBrackets.isCorrect("(){}[()]]"));
        System.out.println(StackBrackets.isCorrect("([}}"));
        System.out.println(StackBrackets.isCorrect(""));
    }
}
