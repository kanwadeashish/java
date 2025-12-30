package com.xworkz.excep.internal;

public class InbuiltExceptions {

    public void arithmeticException(){
        int numberOne = 12;
        System.out.println(numberOne/0);
    }

    public void arrayIndex(){
        int [] numbers = {1,2,3};
        System.out.println(numbers[3]);
    }

    public void nullPointer() {
        String name = null;
        System.out.println(name.length());
    }

    public void numberFormat() {
        String value = "abc";
        int num = Integer.parseInt(value);
    }

    public void stringIndex() {
        String text = "Java";
        System.out.println(text.charAt(5));
    }

    public void classCast() {
        Object obj = new Integer(10);
        String str = (String) obj;
    }

    public void negativeArraySize() {
        int[] arr = new int[-5];
    }

    public void arrayStore() {
        Object[] arr = new Integer[3];
        arr[0] = "Hello";
    }

    public void illegalArgument() {
        Thread t = new Thread();
        t.setPriority(15);
    }

    public void unsupportedOperation() {
        java.util.List list = java.util.List.of(1, 2, 3);
        list.add(4);
    }

}
