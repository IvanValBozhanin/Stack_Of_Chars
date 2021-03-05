package com.company;


import java.util.Arrays;

public class StackBrackets {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public StackBrackets(int cap) {
        elements = new int[cap];
    }

    public StackBrackets() {
        this(DEFAULT_CAPACITY);
    }

    public void push(char ch){
        if(size == elements.length){
            elements = Arrays.copyOf(elements, size<<1);
        }
        elements[size++] = ("({[".indexOf(ch));
    }

    public void pop(){
        --size;
    }

    public char top(){
        return "({[".charAt(elements[size-1]);
    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public static boolean isCorrect(String s){
        StackBrackets sb = new StackBrackets(s.length());
        for(int i=0;i<s.length(); ++i){
            int p = "({[)}]".indexOf(s.charAt(i));
            if(p>2){
                if(sb.empty() || "({[".indexOf(sb.top()) != (p%3))
                    return false;
                sb.pop();
            }
            else{
                sb.push(s.charAt(i));
            }
        }
        return sb.empty();
    }
}
